package com.example.demo;

public class Product {

    private String name;
    private String description;
    private String usageInstructions;
    private String safetyPrecautions;

    // Constructors, getters, and setters
    public Product(String name, String description, String usageInstructions, String safetyPrecautions) {
        this.name = name;
        this.description = description;
        this.usageInstructions = usageInstructions;
        this.safetyPrecautions = safetyPrecautions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsageInstructions() {
        return usageInstructions;
    }

    public void setUsageInstructions(String usageInstructions) {
        this.usageInstructions = usageInstructions;
    }

    public String getSafetyPrecautions() {
        return safetyPrecautions;
    }

    public void setSafetyPrecautions(String safetyPrecautions) {
        this.safetyPrecautions = safetyPrecautions;
    }
}
