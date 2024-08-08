# This files contains your custom actions which can be used to run
# custom Python code.
#
# See this guide on how to implement these action:
# https://rasa.com/docs/rasa/custom-actions


# This is a simple example for a custom action which utters "Hello World!"

import json
from typing import Any, Text, Dict, List

import requests

from rasa_sdk import Action, Tracker
from rasa_sdk.executor import CollectingDispatcher


class action_call_jason_agent(Action):

    def name(self) -> Text:
        return "action_call_jason_agent"

    def run(self, dispatcher: CollectingDispatcher,
            tracker: Tracker,
            domain: Dict[Text, Any]) -> List[Dict[Text, Any]]:

        url = "http://127.0.0.1:8080/webhook"  # Substitua "seu_endereco_aqui" pelo endereço correto
        # Dados da solicitação
        data = {
            "tracker": {
                        "senderID": tracker.sender_id, 
                        "slots": {"intentName": tracker.get_slot('intentName'), 
                                "name": tracker.get_slot('name'), 
                                "session_started_metadata": None},
            }}
                                                                                                                                   
        # Converter dados para JSON
        json_data = json.dumps(data)

        # Definir cabeçalhos da solicitação
        headers = {
        "Content-Type": "application/json"
        }

        # Enviar solicitação POST
        response = requests.post(url, data=json_data, headers=headers)
        dispatcher.utter_message(text=response.json()['responses'][0]['text'])

        return []


