package com.charlene.coffeecorner.beverage.extras;

import com.charlene.coffeecorner.beverage.Beverage;

import static com.charlene.coffeecorner.Store.CURRENCY_CODE;

/**
 * Special roast coffee for 0.90 CHF. This class needs to be refactored to get cost from DAO.
 */
public class SpecialRoastCoffee extends ExtrasDecorator {
    private Beverage beverage;
    private final double costOfSpecialRoast = 0.90;

    public SpecialRoastCoffee(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + costOfSpecialRoast;
    }

    @Override
    public String getDescription() {
        return String.format("%s\n\t\t+Extra Milk\t\t\t%.2f%s", beverage.getDescription(), costOfSpecialRoast,
                CURRENCY_CODE);
    }
}
