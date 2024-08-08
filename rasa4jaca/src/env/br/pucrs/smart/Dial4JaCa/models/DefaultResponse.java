package br.pucrs.smart.Dial4JaCa.models;

public class DefaultResponse {
    private Object responses;
    private double confidence;
    private Object intentResponseKey;
    private String utterAction;

    public Object getResponses() { return responses; }
    public void setResponses(Object value) { this.responses = value; }

    public double getConfidence() { return confidence; }
    public void setConfidence(double value) { this.confidence = value; }

    public Object getIntentResponseKey() { return intentResponseKey; }
    public void setIntentResponseKey(Object value) { this.intentResponseKey = value; }

    public String getUtterAction() { return utterAction; }
    public void setUtterAction(String value) { this.utterAction = value; }
}