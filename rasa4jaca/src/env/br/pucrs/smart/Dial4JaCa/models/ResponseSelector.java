package br.pucrs.smart.Dial4JaCa.models;

public class ResponseSelector {
    private Object[] allRetrievalIntents;
    private Default responseSelectorDefault;

    public Object[] getAllRetrievalIntents() { return allRetrievalIntents; }
    public void setAllRetrievalIntents(Object[] value) { this.allRetrievalIntents = value; }

    public Default getResponseSelectorDefault() { return responseSelectorDefault; }
    public void setResponseSelectorDefault(Default value) { this.responseSelectorDefault = value; }
}