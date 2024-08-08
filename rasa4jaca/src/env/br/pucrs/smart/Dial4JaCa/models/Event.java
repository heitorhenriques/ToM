package br.pucrs.smart.Dial4JaCa.models;

public class Event {
    private String event;
    private double timestamp;
    private Metadata metadata;
    private String name;
    private Object policy;
    private Double confidence;
    private Object actionText;
    private Boolean hideRuleTurn;
    private String text;
    private LatestMessage parseData;
    private String inputChannel;
    private String messageID;
    private String value;
    private Boolean useTextForFeaturization;

    public String getEvent() { return event; }
    public void setEvent(String value) { this.event = value; }

    public double getTimestamp() { return timestamp; }
    public void setTimestamp(double value) { this.timestamp = value; }

    public Metadata getMetadata() { return metadata; }
    public void setMetadata(Metadata value) { this.metadata = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Object getPolicy() { return policy; }
    public void setPolicy(Object value) { this.policy = value; }

    public Double getConfidence() { return confidence; }
    public void setConfidence(Double value) { this.confidence = value; }

    public Object getActionText() { return actionText; }
    public void setActionText(Object value) { this.actionText = value; }

    public Boolean getHideRuleTurn() { return hideRuleTurn; }
    public void setHideRuleTurn(Boolean value) { this.hideRuleTurn = value; }

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }

    public LatestMessage getParseData() { return parseData; }
    public void setParseData(LatestMessage value) { this.parseData = value; }

    public String getInputChannel() { return inputChannel; }
    public void setInputChannel(String value) { this.inputChannel = value; }

    public String getMessageID() { return messageID; }
    public void setMessageID(String value) { this.messageID = value; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public Boolean getUseTextForFeaturization() { return useTextForFeaturization; }
    public void setUseTextForFeaturization(Boolean value) { this.useTextForFeaturization = value; }
}