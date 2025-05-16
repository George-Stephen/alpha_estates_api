package com.infinie.alpha_estate_api.models;

import com.infinie.alpha_estate_api.models.base.User;

import java.util.List;

public class Agent extends User {
    private String agentId;
    private String agencyName;
    private String agencyAddress;
    private String agencyPhone;
    private List<Home> properties;


    public Agent(String id, String name, String email, String phoneNumber, String password, String imageUrl, String userType, String createdAt, String agentId, String agencyName, String agencyAddress, String agencyPhone, List<Home> properties) {
        super(id, name, email, phoneNumber, password, imageUrl, userType, createdAt);
        this.agentId = agentId;
        this.agencyName = agencyName;
        this.agencyAddress = agencyAddress;
        this.agencyPhone = agencyPhone;
        this.properties = properties;
    }

    // Getters and Setters
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }

    public String getAgencyPhone() {
        return agencyPhone;
    }

    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }

    public List<Home> getProperties() {
        return properties;
    }

    public void setProperties(List<Home> properties) {
        this.properties = properties;
    }


}