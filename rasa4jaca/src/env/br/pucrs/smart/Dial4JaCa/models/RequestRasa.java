package br.pucrs.smart.Dial4JaCa.models;

public class RequestRasa {
    private String nextAction;
    private String sender_id;
    private Tracker tracker;
    private Domain domain;
    private String version;

    public String getNextAction() { return nextAction; }
    public void setNextAction(String value) { this.nextAction = value; }

    public String getSenderID() { return sender_id; }
    public void setSenderID(String value) { this.sender_id = value; }

    public Tracker getTracker() { return tracker; }
    public void setTracker(Tracker value) { this.tracker = value; }

    public Domain getDomain() { return domain; }
    public void setDomain(Domain value) { this.domain = value; }

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }
}












