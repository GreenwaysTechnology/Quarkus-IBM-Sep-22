package com.ibm.model;

public class User {
    private int id;
    private String userName;
    private String userCity;

    public User() {
    }

    public User(int id, String userName, String userCity) {
        this.id = id;
        this.userName = userName;
        this.userCity = userCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }
}
