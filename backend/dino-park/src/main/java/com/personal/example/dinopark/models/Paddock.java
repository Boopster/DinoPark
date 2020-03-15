package com.personal.example.dinopark.models;

import java.util.ArrayList;

public class Paddock {

    private int capacity;
    private int price;
    private ArrayList<Dinosaur> dinosaurs;

    public Paddock(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
        this.dinosaurs = new ArrayList<Dinosaur>();
    }

    public Paddock() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(ArrayList<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }

    public int getDinosaurCount() {
        return this.dinosaurs.size();
    }

    public void addDinosaurToPaddock(Dinosaur dinosaur) {
        this.dinosaurs.add(dinosaur);
    }
}
