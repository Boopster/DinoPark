package com.personal.example.dinopark.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "paddocks")
public class Paddock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private int capacity;
    @Column
    private int price;
    @JsonIgnoreProperties("paddocks")
    @ManyToOne
    @JoinColumn(name = "park_id", nullable = false)
    private Park park;
//    private ArrayList<Dinosaur> dinosaurs;

    public Paddock(int capacity, int price, Park park) {
        this.capacity = capacity;
        this.price = price;
        this.park = park;
//        this.dinosaurs = new ArrayList<Dinosaur>();
    }

    public Paddock() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }



    //    public ArrayList<Dinosaur> getDinosaurs() {
//        return dinosaurs;
//    }
//
//    public void setDinosaurs(ArrayList<Dinosaur> dinosaurs) {
//        this.dinosaurs = dinosaurs;
//    }
//
//    public int getDinosaurCount() {
//        return this.dinosaurs.size();
//    }
//
//    public void addDinosaurToPaddock(Dinosaur dinosaur) {
//        this.dinosaurs.add(dinosaur);
//    }
}
