package br.pucrs.smart.Dial4JaCa.models;

public class Bed {
    private String type;
    private BedMapping[] mappings;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public BedMapping[] getMappings() { return mappings; }
    public void setMappings(BedMapping[] value) { this.mappings = value; }
}