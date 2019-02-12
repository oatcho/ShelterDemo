package com.company;

import java.util.ArrayList;

public class Shelter {
    private double funds;
    private ArrayList<AnimalProfile> animals;

    public Shelter(double funds) {
        this.funds = funds;
        this.animals = new ArrayList<>();
    }

    public void addAnimalProfile(AnimalProfile animalProfile) {
        animals.add(animalProfile);
        System.out.println(animals);
    }

    public void removeAnimalProfileByID(int animalId) {

        if (animals.size() == 0) {
            System.out.println("There are no animals in the shelter. Please add one before deleting.\n");
        } else {

            for (int i = 0; i < animals.size(); i++) {
                if (animalId == animals.get(i).getIdNumber()) {
                    System.out.println("You just removed: " + animalId + ", " + animals.get(i).getName() + "\n");
                    animals.remove(i);
                } else if ((i == animals.size() - 1)) {
                    System.out.println("There is no animal in the shelter by that ID.");
                }
            }

        }

    }

    public void searchByIdAndPrint(int animalId) {

        if (animals.size() == 0) {
            System.out.println("There are no animals in the shelter. Please add one before searching.\n");
        } else {

            for (int i = 0; i < animals.size(); i++) {
                if (animalId == animals.get(i).getIdNumber()) {
                    animals.get(i).printAnimalProfile();
                } else if ((i == animals.size() - 1)) {
                    System.out.println("There is no animal in the shelter by that ID.");
                }
            }

        }

    }

    public void displayAllAnimals() {
        if (animals.size() == 0) {
            System.out.println("There are no animals to display");
        }else{
            for (AnimalProfile animalProfile : animals) {
                animalProfile.printAnimalProfile();
            }
        }
    }

    public void displayByStatus(String statusSearch){

        int counter = 0;

        if(animals.size() == 0) {
            System.out.println("There are no animals in the shelter. \n");
        } else {
            for (AnimalProfile animalProfile : animals) {
                if (animalProfile.getStatus().equalsIgnoreCase(statusSearch)) {
                    animalProfile.printAnimalProfile();
                } else if(counter == animals.size() - 1) {
                    System.out.println("There are no animals in here by that status, bro!");
                }
                counter++;
            }
        }
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
