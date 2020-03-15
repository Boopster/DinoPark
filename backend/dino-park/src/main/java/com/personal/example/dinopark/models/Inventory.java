package com.personal.example.dinopark.models;

public class Inventory {

    private int meatCount;
    private int mushroomCount;
    private int dinoEggCount;
    private int medicineCount;

    public Inventory() {
        this.meatCount = 0;
        this.mushroomCount = 0;
        this.dinoEggCount = 0;
        this.medicineCount = 0;
    }

    public int getMeatCount() {
        return meatCount;
    }

    public void setMeatCount(int meatCount) {
        this.meatCount = meatCount;
    }

    public int getMushroomCount() {
        return mushroomCount;
    }

    public void setMushroomCount(int mushroomCount) {
        this.mushroomCount = mushroomCount;
    }

    public int getDinoEggCount() {
        return dinoEggCount;
    }

    public void setDinoEggCount(int dinoEggCount) {
        this.dinoEggCount = dinoEggCount;
    }

    public int getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(int medicineCount) {
        this.medicineCount = medicineCount;
    }

}
