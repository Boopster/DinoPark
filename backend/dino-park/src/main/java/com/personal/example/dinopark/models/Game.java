package com.personal.example.dinopark.models;

public class Game {
    private Long id;
    private String username;
    private String parkName;

    public Game(String username, String parkName) {
        this.username = username;
        this.parkName = parkName;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getParkName() {
        return parkName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

}
