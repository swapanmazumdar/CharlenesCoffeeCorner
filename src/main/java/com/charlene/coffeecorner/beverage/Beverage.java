package com.charlene.coffeecorner.beverage;

import com.charlene.coffeecorner.menu.MenuItem;

public abstract class Beverage implements MenuItem {
    private String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();

}
