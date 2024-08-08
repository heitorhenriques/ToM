package br.pucrs.smart.Dial4JaCa.models;

public class TrackerSlots {
    private String intentName;
    private Object patient;
    private Object bed;
    private Object numPatients;
    private Object sessionStartedMetadata;

    public String getIntentName() { return intentName; }
    public void setIntentName(String value) { this.intentName = value; }

    public Object getPatient() { return patient; }
    public void setPatient(Object value) { this.patient = value; }

    public Object getBed() { return bed; }
    public void setBed(Object value) { this.bed = value; }

    public Object getNumPatients() { return numPatients; }
    public void setNumPatients(Object value) { this.numPatients = value; }

    public Object getSessionStartedMetadata() { return sessionStartedMetadata; }
    public void setSessionStartedMetadata(Object value) { this.sessionStartedMetadata = value; }
}