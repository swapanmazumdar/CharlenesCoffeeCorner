package com.charlene.coffeecorner.beverage.extras;

import com.charlene.coffeecorner.beverage.Beverage;

import static com.charlene.coffeecorner.Store.CURRENCY_CODE;

/**
 * Foamed milk costs 0.50 CHF. This class needs to be refactored to get cost from DAO.
 */
public class FoamedMilk extends ExtrasDecorator {
    private Beverage beverage;
    private final double costOfFoamedMilk = 0.50;

    public FoamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + costOfFoamedMilk;
    }

    @Override
    public String getDescription() {
        return String.format("%s\n\t\t+Foamed Milk\t\t\t%.2f%s", beverage.getDescription(), costOfFoamedMilk,
                CURRENCY_CODE);
    }
}
