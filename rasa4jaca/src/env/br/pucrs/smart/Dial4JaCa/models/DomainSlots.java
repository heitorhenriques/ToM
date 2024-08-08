package br.pucrs.smart.Dial4JaCa.models;

public class DomainSlots {
    private IntentName intentName;
    private Bed patient;
    private Bed bed;
    private Bed numPatients;

    public IntentName getIntentName() { return intentName; }
    public void setIntentName(IntentName value) { this.intentName = value; }

    public Bed getPatient() { return patient; }
    public void setPatient(Bed value) { this.patient = value; }

    public Bed getBed() { return bed; }
    public void setBed(Bed value) { this.bed = value; }

    public Bed getNumPatients() { return numPatients; }
    public void setNumPatients(Bed value) { this.numPatients = value; }
}