package com.personal.example.dinopark.models;

public class Dinosaur {

    private String species;
    private String diet;
    private int health;
    private int age;

    public Dinosaur(String species, String diet) {
        this.species = species;
        this.diet = diet;
        this.health = 10;
    }

    public Dinosaur() {
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
