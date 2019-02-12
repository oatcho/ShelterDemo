package com.company;

import java.util.Scanner;

public class AnimalProfileCreator {
    public void createNewProfile(int animalID, Shelter shelter, Scanner scanner){
        int id = animalID;
        System.out.println("What is the name of your animal?");
        String name = scanner.nextLine();
        System.out.println("What is the type of animal?");
        String typeOfAnimal = scanner.nextLine();
        System.out.println("What is the breed of your animal?");
        String breed = scanner.nextLine();
        System.out.println("What color is your animal?");
        String color = scanner.nextLine();
        System.out.println("How many years old is your animal?");
        int age = scanner.nextInt();
        scanner.nextLine();
//        System.out.println("Int : " + age + " BugLine: " + bugLine + "<----");
        System.out.println("When is said animal expected to arrive?");
        String arrivalDate = scanner.nextLine();
        System.out.println("What is the adoption status of this animal?");
        String status = scanner.nextLine();
        AnimalProfile newAnimal = new AnimalProfile(id, name, typeOfAnimal, breed, color, age, arrivalDate, status);
        shelter.addAnimalProfile(newAnimal);
    }
}
