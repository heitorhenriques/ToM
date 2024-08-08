package br.pucrs.smart.Dial4JaCa.models;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRasa {
    private ArrayList<HashMap<String,String>> responses = new ArrayList<HashMap<String,String>>();
	private ArrayList<Object> events = null;

    public ArrayList<HashMap<String,String>> getResponses() {
        return responses;
    }

    public ArrayList<Object> getEvents() {
        return events;
    }

    public void setResponse(String response) {
        HashMap<String,String> message = new HashMap<String,String>();
        message.put("text", response);
        responses.add(message);
        return;
    }
}
