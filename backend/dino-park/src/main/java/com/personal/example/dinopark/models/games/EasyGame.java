package com.personal.example.dinopark.models.games;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Easy")
public class EasyGame extends Game {

    @Column
    private String difficulty = "easy";

    @Column
    private int balance = 2000;

    public EasyGame(String username) {
        super(username);
    }

    public EasyGame() {
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
