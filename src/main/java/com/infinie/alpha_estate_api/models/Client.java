package com.infinie.alpha_estate_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.infinie.alpha_estate_api.models.base.User;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "client")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @EmbeddedId
    @JsonUnwrapped
    private User user;
    @Column(name = "preferredLocation")
    private String preferredLocation;
    @Column(name = "budget")
    private String budget;

    @Column(name = "propertyType")
    private String propertyType;


    // Getters and Setters
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
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
