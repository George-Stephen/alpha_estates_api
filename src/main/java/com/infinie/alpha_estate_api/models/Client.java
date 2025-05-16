package com.infinie.alpha_estate_api.models;

import com.infinie.alpha_estate_api.models.base.User;

public class Client extends User {
    private String clientId;
    private String preferredLocation;
    private String budget;
    private String propertyType;

    public Client(String id, String name, String email, String phoneNumber, String password, String imageUrl, String userType, String createdAt, String clientId, String preferredLocation, String budget, String propertyType) {
        super(id, name, email, phoneNumber, password, imageUrl, userType, createdAt);
        this.clientId = clientId;
        this.preferredLocation = preferredLocation;
        this.budget = budget;
        this.propertyType = propertyType;
    }

    // Getters and Setters
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
