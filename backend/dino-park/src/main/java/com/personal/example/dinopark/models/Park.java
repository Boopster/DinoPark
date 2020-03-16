package com.personal.example.dinopark.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parks")
public class Park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String parkName;
    @OneToMany(mappedBy = "park")
    private List<Paddock> paddocks;
    @Column
    private int rating;

    public Park(String parkName) {
        this.parkName = parkName;
        this.paddocks = new ArrayList<Paddock>();
        this.rating = 100;
    }

    public Park() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPaddockCount() {
        return paddocks.size();
    }

    public void addPaddockToPark(Paddock paddock) {
        this.paddocks.add(paddock);
    }
}
