package com.infinie.alpha_estate_api.models.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
public class User implements Serializable {
    @JsonProperty("full_name")
    @Column(name = "full_name", nullable = false)
    private String full_name;
    @JsonProperty("email")
    @Column(name = "email", nullable = false)
    private String email;
    @JsonProperty("phone")
    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;
    @JsonProperty("password")
    @Column(name = "password", nullable = false)
    private String password;
    @JsonProperty("profile")
    @Column(name = "profileImage", nullable = false)
    private String imageUrl;
    @JsonProperty("created_at")
    @Column(name = "id", nullable = false)
    private LocalDate createdAt;


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
