package com.personal.example.dinopark.models.games;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Normal")
public class NormalGame extends Game {

    @Column
    private String difficulty = "normal";

    @Column
    private int balance = 1500;

    public NormalGame(String username) {
        super(username);
    }

    public NormalGame() {
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

}
