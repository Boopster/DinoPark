package com.personal.example.dinopark.models;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String username;
    @Column
    private String difficulty;
    @Column
    private int balance;
//    @Column
//    private Park park;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventory_id", referencedColumnName = "Id")
    private Inventory inventory;

    public Game(String username, String parkName, String difficulty) {
        this.username = username;
//        this.park = new Park(parkName);
        this.difficulty = difficulty;
        this.balance = 2000;
        this.inventory = new Inventory();
    }

    public Game() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Park getPark() {
//        return park;
//    }

//    public void setPark(Park park) {
//        this.park = park;
//    }

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

