package com.trutek.looped.data.impl.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "HEALTH_PARAM".
 */
public class HealthParam {

    private Long id;
    private String serverId;
    private String name;
    private String unit;

    public HealthParam() {
    }

    public HealthParam(Long id) {
        this.id = id;
    }

    public HealthParam(Long id, String serverId, String name, String unit) {
        this.id = id;
        this.serverId = serverId;
        this.name = name;
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}