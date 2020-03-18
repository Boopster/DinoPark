package com.personal.example.dinopark.models;

import javax.persistence.*;

@Entity
@Table(name = "inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private int meatCount = 0;
    @Column
    private int mushroomCount = 0;
    @Column
    private int dinoEggCount = 0;
    @Column
    private int medicineCount = 0;

    public Inventory() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
