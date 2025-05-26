package com.infinie.alpha_estate_api.models;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.infinie.alpha_estate_api.models.base.User;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String agencyId;

    @EmbeddedId
    @JsonUnwrapped
    private User user;

    @Column(name = "agencyName")
    private String agencyName;
    @Column(name = "agencyAddress")
    private String agencyAddress;
    @Column(name = "agencyPhone")
    private String agencyPhone;
    @Column(name = "properties")
    private List<Home> properties;


    // Getters and Setter

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