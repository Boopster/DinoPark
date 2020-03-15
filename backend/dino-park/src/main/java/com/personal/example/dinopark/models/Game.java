package com.personal.example.dinopark.models;

import javax.persistence.*;

public class Game {

    private String username;
    private String difficulty;
    private int balance;
    private Park park;
    private Inventory inventory;

    public Game(String username, String parkName, String difficulty) {
        this.username = username;
        this.park = new Park(parkName);
        this.difficulty = difficulty;
        this.balance = 2000;
        this.inventory = new Inventory();
    }

    public Game() {
    }

    public String getUsername() {
        return username;
    }

    public Park getPark() {
        return park;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
}

