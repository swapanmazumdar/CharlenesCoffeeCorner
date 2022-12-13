package com.charlene.coffeecorner.beverage;

public class OrangeJuice implements MenuItem {
    private final String description = "Freshly squeezed orange juice (0.25l)";
    private final double cost = 3.95;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return 0;
    }

}
