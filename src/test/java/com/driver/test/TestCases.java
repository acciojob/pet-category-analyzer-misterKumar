package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import com.driver.*;

public class TestCases {
	@Test
    void testAddPet() {
        PetCategoryAnalyzer pca = new PetCategoryAnalyzer();
        pca.addPet("TestPet", 10, "Herbivore", 1);

        // Ensure the pet was added successfully
        assertNotNull(pca.calculatePopularityIndex("TestPet"));
    }
	


	    @Test
	    void testCalculatePopularityIndexNotFound() {
	        PetCategoryAnalyzer pca = new PetCategoryAnalyzer();

	        // Ensure the method returns -1 when the pet is not found
	        assertEquals(-1, pca.calculatePopularityIndex("NonExistentPet"));
	    }
	    
	    @Test
	    void testAddMultiplePets() {
	        PetCategoryAnalyzer pca = new PetCategoryAnalyzer();

	        // Add multiple pets
	        pca.addPet("Dog", 12, "Omnivore", 2);
	        pca.addPet("Cat", 15, "Carnivore", 1);
	        pca.addPet("Parrot", 20, "Herbivore", 3);

	        // Ensure all pets were added successfully
	        assertNotNull(pca.calculatePopularityIndex("Dog"));
	        assertNotNull(pca.calculatePopularityIndex("Cat"));
	        assertNotNull(pca.calculatePopularityIndex("Parrot"));
	    }
	    
	   

}
