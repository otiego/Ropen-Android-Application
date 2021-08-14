package com.example.businessclientapplication;

public class User {
    public String email;
    public String password;
    public boolean status;

    public User(String email, String password, boolean status) {
        this.email = email;
        this.password = password;
        this.status = status;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
