package com.personal.example.dinopark.models.games;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Normal")
public class Normal extends Game {

    @Column
    private int balance = 1500;

    public Normal(String username, String difficulty) {
        super(username, difficulty);
    }

    public Normal() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
