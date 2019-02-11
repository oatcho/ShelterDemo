package com.company;

import java.util.Scanner;

public class ShelterDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserMenu userMenu = new UserMenu();

        final String addAnimalProfile = "1";
        final String deleteProfile = "2";
        final String searchProfileById = "3";
        final String editProfileByID = "4";
        final String displayAllAnimals = "5";
        final String viewByStatus = "6";
        final String showSixMonthsSinceArrival = "7";
        final String checkExcessCapacity = "8";
        final String exit = "9";


        userMenu.showMainMenu();
        String chosenMenuOption = scanner.nextLine();

        switch (chosenMenuOption){
            case addAnimalProfile:
                break;
            case deleteProfile:
                break;
            case searchProfileById:
                break;
            case editProfileByID:
                break;
            case displayAllAnimals:
                break;
            case viewByStatus:
                break;
            case showSixMonthsSinceArrival:
                break;
            case checkExcessCapacity:
                break;
            case exit:
                break;
            default:
                break;
        }

    }
}
