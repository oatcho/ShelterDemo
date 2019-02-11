package com.company;

import java.util.ArrayList;

public class Shelter {
    private double funds;
    private ArrayList<AnimalProfile> animals;

    public Shelter (double funds){
        this.funds = funds;
        this.animals = new ArrayList<>();
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public ArrayList<AnimalProfile> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<AnimalProfile> animals) {
        this.animals = animals;
    }
}
