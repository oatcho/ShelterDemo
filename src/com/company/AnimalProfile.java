package com.company;

public class AnimalProfile {
    private int idNumber;
    private String name;
    private String typeOfAnimal;
    private String breed;
    private String color;
    private int age;
    private String arrivalDate;
    private String status;

    public AnimalProfile(int idNumber, String name, String typeOfAnimal, String breed, String color, int age, String arrivalDate, String status) {
        this.idNumber = idNumber;
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.status = status;
    }

    public void printAnimalProfile(){
        System.out.println("ID: " + idNumber + ", Name: " + name + ", Animal Type: " + typeOfAnimal + ", Breed: " + breed + ", Color: " + color + ", Age: " + age + ", Arrival Date: " + arrivalDate + "Adoption Status: " + status);
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
