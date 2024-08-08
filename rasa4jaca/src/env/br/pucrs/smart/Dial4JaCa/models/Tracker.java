package br.pucrs.smart.Dial4JaCa.models;

import java.util.HashMap;

public class Tracker {
    private String senderID;
    private HashMap<String,Object> slots;
    private LatestMessage latestMessage;
    private double latestEventTime;
    private Object followupAction;
    private boolean paused;
    private Event[] events;
    private String latestInputChannel;
    private ActiveLoop activeLoop;
    private LatestAction latestAction;
    private String latestActionName;

    public String getSenderID() { return senderID; }
    public void setSenderID(String value) { this.senderID = value; }

    public HashMap<String,Object> getSlots() { return slots; }
    public void setSlots(HashMap<String,Object> value) { this.slots = value; }

    public LatestMessage getLatestMessage() { return latestMessage; }
    public void setLatestMessage(LatestMessage value) { this.latestMessage = value; }

    public double getLatestEventTime() { return latestEventTime; }
    public void setLatestEventTime(double value) { this.latestEventTime = value; }

    public Object getFollowupAction() { return followupAction; }
    public void setFollowupAction(Object value) { this.followupAction = value; }

    public boolean getPaused() { return paused; }
    public void setPaused(boolean value) { this.paused = value; }

    public Event[] getEvents() { return events; }
    public void setEvents(Event[] value) { this.events = value; }

    public String getLatestInputChannel() { return latestInputChannel; }
    public void setLatestInputChannel(String value) { this.latestInputChannel = value; }

    public ActiveLoop getActiveLoop() { return activeLoop; }
    public void setActiveLoop(ActiveLoop value) { this.activeLoop = value; }

    public LatestAction getLatestAction() { return latestAction; }
    public void setLatestAction(LatestAction value) { this.latestAction = value; }

    public String getLatestActionName() { return latestActionName; }
    public void setLatestActionName(String value) { this.latestActionName = value; }
}