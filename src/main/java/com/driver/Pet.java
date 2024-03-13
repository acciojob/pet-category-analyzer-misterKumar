package com.driver;

public class Pet {
	private String name;
    private int lifespan;
    private String dietaryNeeds;
    private int maintenanceLevel;

    public Pet(String name, int lifespan, String dietaryNeeds, int maintenanceLevel) {
    	// your code goes here
        this.name=name;
        this.lifespan=lifespan;
        this.dietaryNeeds=dietaryNeeds;
        this.maintenanceLevel=maintenanceLevel;
    }

    public int getLifespan() {
    	// your code goes here
        return lifespan;
    }

    public String getDietaryNeeds() {
    	// your code goes here
        return dietaryNeeds;
    }

    public int getMaintenanceLevel() {
    	// your code goes here
        return maintenanceLevel;
    }
}
