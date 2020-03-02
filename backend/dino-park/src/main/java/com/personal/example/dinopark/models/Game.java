package com.personal.example.dinopark.models;

import javax.persistence.*;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "parkName")
    private String parkName;
    @Column(name = "difficulty")
    private String difficulty;
    @Column(name = "balance")
    private Long balance;

    public Game(String username, String parkName, String difficulty, Long balance) {
        this.username = username;
        this.parkName = parkName;
        this.difficulty = difficulty;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
