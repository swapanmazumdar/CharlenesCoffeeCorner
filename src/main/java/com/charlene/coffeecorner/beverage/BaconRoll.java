package com.charlene.coffeecorner.beverage;

import com.charlene.coffeecorner.beverage.MenuItem;

public class BaconRoll implements MenuItem {

    private final String description = "Bacon Roll";
    private final double cost = 4.50;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
