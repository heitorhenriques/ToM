package br.pucrs.smart.Dial4JaCa.models;

public class IntentName {
    private String type;
    private IntentNameMapping[] mappings;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public IntentNameMapping[] getMappings() { return mappings; }
    public void setMappings(IntentNameMapping[] value) { this.mappings = value; }
}