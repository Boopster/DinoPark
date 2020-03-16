package com.personal.example.dinopark.models;

import javax.persistence.*;

@Entity
@Table(name = "dinosaurs")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String species;
    @Column
    private String diet;
    @Column
    private int health;
    @Column
    private int age;

    public Dinosaur(String species, String diet) {
        this.species = species;
        this.diet = diet;
        this.health = 10;
    }

    public Dinosaur() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
