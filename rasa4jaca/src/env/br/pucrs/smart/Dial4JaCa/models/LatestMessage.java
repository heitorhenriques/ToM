package br.pucrs.smart.Dial4JaCa.models;

public class LatestMessage {
    private Intent intent;
    private Object[] entities;
    private String text;
    private String messageID;
    private ActiveLoop metadata;
    private long[][] textTokens;
    private IntentRasa[] intentRanking;
    private ResponseSelector responseSelector;

    public Intent getIntent() { return intent; }
    public void setIntent(Intent value) { this.intent = value; }

    public Object[] getEntities() { return entities; }
    public void setEntities(Object[] value) { this.entities = value; }

    public String getText() { return text; }
    public void setText(String value) { this.text = value; }

    public String getMessageID() { return messageID; }
    public void setMessageID(String value) { this.messageID = value; }

    public ActiveLoop getMetadata() { return metadata; }
    public void setMetadata(ActiveLoop value) { this.metadata = value; }

    public long[][] getTextTokens() { return textTokens; }
    public void setTextTokens(long[][] value) { this.textTokens = value; }

    public IntentRasa[] getIntentRanking() { return intentRanking; }
    public void setIntentRanking(IntentRasa[] value) { this.intentRanking = value; }

    public ResponseSelector getResponseSelector() { return responseSelector; }
    public void setResponseSelector(ResponseSelector value) { this.responseSelector = value; }
}