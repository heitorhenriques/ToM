package br.pucrs.smart.Dial4JaCa.models;

public class SessionConfig {
    private long sessionExpirationTime;
    private boolean carryOverSlotsToNewSession;

    public long getSessionExpirationTime() { return sessionExpirationTime; }
    public void setSessionExpirationTime(long value) { this.sessionExpirationTime = value; }

    public boolean getCarryOverSlotsToNewSession() { return carryOverSlotsToNewSession; }
    public void setCarryOverSlotsToNewSession(boolean value) { this.carryOverSlotsToNewSession = value; }
}