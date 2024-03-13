package com.driver;

import java.util.Scanner;

public class PetCategoryAnalyzerApp {
	public static void main(String[] args) {
        PetCategoryAnalyzer pca = new PetCategoryAnalyzer();

        // Adding sample pets
        pca.addPet("Dog", 12, "Omnivore", 2);
        pca.addPet("Cat", 15, "Carnivore", 1);
        pca.addPet("Parrot", 20, "Herbivore", 3);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the pet to analyze: ");
        String petName = scanner.nextLine();

        double popularityIndex = pca.calculatePopularityIndex(petName);

        if (popularityIndex != -1) {
            System.out.println("Popularity Index for " + petName + ": " + popularityIndex);
        }

        scanner.close();
    }
}
