package com.example.businessclientapplication;

public class Business extends User{
    public String businessName;
    public String location;
    public int phoneNumber;

    public Business(String email, String password, String businessName, String location, int phoneNumber) {
        super(email, password, false);
        this.businessName = businessName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getLocation() {
        return location;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
