package br.pucrs.smart.Dial4JaCa.interfaces;

import java.util.HashMap;
import java.util.List;

import br.pucrs.smart.Dial4JaCa.models.ResponseDialogflow;
import br.pucrs.smart.Dial4JaCa.models.ResponseRasa;
import br.pucrs.smart.Dial4JaCa.models.OutputContexts;

public interface IAgent {
	public ResponseDialogflow intentionProcessing(String responseId, String intentName, HashMap<String, Object> parameters, List<OutputContexts> outputContexts, String session);
	public ResponseRasa RasaIntentionProcessing(String intentName, HashMap<String, Object> parameters, String session);
}

