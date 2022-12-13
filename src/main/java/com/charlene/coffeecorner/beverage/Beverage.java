package com.charlene.coffeecorner.beverage;

public abstract class Beverage implements MenuItem {
    private String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();

}
