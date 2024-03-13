package com.driver;

import java.util.HashMap;
import java.util.Map;

public class PetCategoryAnalyzer {
	private Map<String, Pet> pets;

    public PetCategoryAnalyzer() {
    	// your code goes here
        pets=new HashMap<>();
    }

    public void addPet(String name, int lifespan, String dietaryNeeds, int maintenanceLevel) {
    	// your code goes here
        pets.put(name, new Pet(name, lifespan, dietaryNeeds, maintenanceLevel));
    }

    public double calculatePopularityIndex(String petName) {
    	// your code goes here
        Pet pet = pets.get(petName);
        if (pet == null) {
            System.out.println("Pet not found in the database.");
            return -1;
        }

        // Define weights for each criteria
        double lifespanWeight = 0.3;
        double dietaryNeedsWeight = 0.4;
        double maintenanceLevelWeight = 0.3;

        // Calculate popularity index
        double popularityIndex = (pet.getLifespan() * lifespanWeight)
                + (pet.getMaintenanceLevel() * maintenanceLevelWeight)
                + (pet.getDietaryNeeds().equals("Carnivore") ? 1 : 0) * dietaryNeedsWeight;

        return popularityIndex;
    }
}
