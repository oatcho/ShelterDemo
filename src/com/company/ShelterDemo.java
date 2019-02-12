package com.company;

import java.util.Scanner;

public class ShelterDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserMenu userMenu = new UserMenu();
        AnimalProfileCreator animalProfileCreator = new AnimalProfileCreator();
        Shelter shelter = new Shelter(150000);

        int animalID = 1;
        boolean continueMenu = true;


        final String addAnimalProfile = "1";
        final String deleteProfile = "2";
        final String searchProfileById = "3";
        final String editProfileByID = "4";
        final String displayAllAnimals = "5";
        final String viewByStatus = "6";
        final String showSixMonthsSinceArrival = "7";
        final String checkExcessCapacity = "8";
        final String exit = "9";


        do {
            userMenu.showMainMenu();
            String chosenMenuOption = scanner.nextLine();

            switch (chosenMenuOption) {
                case addAnimalProfile:
                    animalProfileCreator.createNewProfile(animalID, shelter, scanner);

                    animalID++;
                    break;
                case deleteProfile:
                    System.out.println("What is the ID of the animal you would like to remove?");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();
                    shelter.removeAnimalProfileByID(idToDelete);
                    break;
                case searchProfileById:
                    System.out.println("What is the ID of the animal you would like to look up?");
                    int idToFindAnimalInfo = scanner.nextInt();
                    scanner.nextLine();
                    shelter.searchByIdAndPrint(idToFindAnimalInfo);
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
                    System.out.println("Thanks for visiting the shelter!");
                    continueMenu = false;
                    break;
                default:
                    break;
            }

        }while(continueMenu);
        }
}
