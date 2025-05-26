package com.infinie.alpha_estate_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "home")
public class Home {
    private String imageUrl;
    private String title;
    private String location;
    private String description;
    private String bedrooms;
    private String bathrooms;
    private String parking_spaces;
    private String bed_imageUrl;
    private String bath_imageUrl;
    private String kitchen_imageUrl;
    private String latitude;
    private String longitude;  // "long" is a reserved keyword in Java
    private String property_size;
    private String realtor_phone_number;
    private String year_built;
    private String home_state;
    private String property_type;
    private String price;

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

    public String getRealtor_phone_number() {
        return realtor_phone_number;
    }

    public void setRealtor_phone_number(String realtor_phone_number) {
        this.realtor_phone_number = realtor_phone_number;
    }

    public String getYear_built() {
        return year_built;
    }

    public void setYear_built(String year_built) {
        this.year_built = year_built;
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
