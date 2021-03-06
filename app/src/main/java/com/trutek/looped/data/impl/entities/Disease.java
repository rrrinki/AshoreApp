package com.trutek.looped.data.impl.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DISEASE".
 */
public class Disease {

    private Long id;
    private String name;
    /** Not-null value. */
    private String serverId;
    /** Not-null value. */
    private String recipientId;
    private java.util.Date timeStamp;
    private String syncStatus;

    public Disease() {
    }

    public Disease(Long id) {
        this.id = id;
    }

    public Disease(Long id, String name, String serverId, String recipientId, java.util.Date timeStamp, String syncStatus) {
        this.id = id;
        this.name = name;
        this.serverId = serverId;
        this.recipientId = recipientId;
        this.timeStamp = timeStamp;
        this.syncStatus = syncStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Not-null value. */
    public String getServerId() {
        return serverId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /** Not-null value. */
    public String getRecipientId() {
        return recipientId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public java.util.Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

}
