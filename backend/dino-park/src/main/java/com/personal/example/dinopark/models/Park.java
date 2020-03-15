package com.personal.example.dinopark.models;

import java.util.ArrayList;

public class Park {

    private String parkName;
    private ArrayList<Paddock> paddocks;
    private int rating;

    public Park(String parkName) {
        this.parkName = parkName;
        this.paddocks = new ArrayList<Paddock>();
        this.rating = 100;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public ArrayList<Paddock> getPaddock() {
        return paddocks;
    }

    public void setPaddock(ArrayList<Paddock> paddocks) {
        this.paddocks = paddocks;
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
