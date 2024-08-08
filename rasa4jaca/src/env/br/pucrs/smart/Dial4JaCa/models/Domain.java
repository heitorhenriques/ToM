package br.pucrs.smart.Dial4JaCa.models;
import java.util.Map;

public class Domain {
    private String version;
    private String[] intents;
    private String[] entities;
    private Map<String, ResponseElement[]> responses;
    private String[] actions;
    private DomainSlots slots;
    private Config config;
    private SessionConfig sessionConfig;

    public String getVersion() { return version; }
    public void setVersion(String value) { this.version = value; }

    public String[] getIntents() { return intents; }
    public void setIntents(String[] value) { this.intents = value; }

    public String[] getEntities() { return entities; }
    public void setEntities(String[] value) { this.entities = value; }

    public Map<String, ResponseElement[]> getResponses() { return responses; }
    public void setResponses(Map<String, ResponseElement[]> value) { this.responses = value; }

    public String[] getActions() { return actions; }
    public void setActions(String[] value) { this.actions = value; }

    public DomainSlots getSlots() { return slots; }
    public void setSlots(DomainSlots value) { this.slots = value; }

    public Config getConfig() { return config; }
    public void setConfig(Config value) { this.config = value; }

    public SessionConfig getSessionConfig() { return sessionConfig; }
    public void setSessionConfig(SessionConfig value) { this.sessionConfig = value; }
}
