package com.personal.example.dinopark.models.games;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Easy")
public class Easy extends Game {

    @Column
    private int balance = 2000;

    public Easy(String username, String difficulty) {
        super(username, difficulty);
    }

    public Easy() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
