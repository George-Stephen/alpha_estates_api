package com.infinie.alpha_estate_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "home")
public class Home {

    @Id
    @Column(name = "home_id")
    private String homeId;

    @Column(name = "image_url", columnDefinition = "TEXT")
    private String imageUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "location")
    private String location;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "bedrooms")
    private String bedrooms;

    @Column(name = "bathrooms")
    private String bathrooms;

    @Column(name = "parking_spaces")
    private String parking_spaces;

    @Column(name = "bed_image_url", columnDefinition = "TEXT")
    private String bed_imageUrl;

    @Column(name = "bath_image_url", columnDefinition = "TEXT")
    private String bath_imageUrl;

    @Column(name = "kitchen_image_url", columnDefinition = "TEXT")
    private String kitchen_imageUrl;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude; // "long" is a reserved keyword in Java

    @Column(name = "property_size")
    private String property_size;

    @Column(name = "year_built")
    private LocalDate year_built;

    @Column(name = "home_state")
    private String home_state;

    @Column(name = "property_type")
    private String property_type;

    @Column(name = "price")
    private String price;

    @Column(name = "agency")
    private String agency;

    public Home() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(String bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getParking_spaces() {
        return parking_spaces;
    }

    public void setParking_spaces(String parking_spaces) {
        this.parking_spaces = parking_spaces;
    }

    public String getBed_imageUrl() {
        return bed_imageUrl;
    }

    public void setBed_imageUrl(String bed_imageUrl) {
        this.bed_imageUrl = bed_imageUrl;
    }

    public String getBath_imageUrl() {
        return bath_imageUrl;
    }

    public void setBath_imageUrl(String bath_imageUrl) {
        this.bath_imageUrl = bath_imageUrl;
    }

    public String getKitchen_imageUrl() {
        return kitchen_imageUrl;
    }

    public void setKitchen_imageUrl(String kitchen_imageUrl) {
        this.kitchen_imageUrl = kitchen_imageUrl;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getProperty_size() {
        return property_size;
    }

    public void setProperty_size(String property_size) {
        this.property_size = property_size;
    }

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public LocalDate getYear_built() {
        return year_built;
    }

    public void setYear_built(LocalDate year_built) {
        this.year_built = year_built;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getHome_state() {
        return home_state;
    }

    public void setHome_state(String home_state) {
        this.home_state = home_state;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
