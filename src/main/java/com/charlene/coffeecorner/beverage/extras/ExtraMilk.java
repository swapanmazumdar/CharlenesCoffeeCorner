package com.charlene.coffeecorner.beverage.extras;

import com.charlene.coffeecorner.beverage.Beverage;

import static com.charlene.coffeecorner.Store.CURRENCY_CODE;

/**
 * Extra milk costs 0.30 CHF. This class needs to be refactored to get cost from DAO.
 */
public class ExtraMilk extends ExtrasDecorator {

    private final double costOfExtraMilk = 0.30;
    private Beverage beverage;

    public ExtraMilk(Beverage beverage) {
        if(beverage == null) {
            throw new RuntimeException("Beverage can't be null");
        }
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + costOfExtraMilk;
    }

    @Override
    public String getDescription() {
        return String.format("%s\n\t\t+Extra Milk\t\t\t%.2f%s", beverage.getDescription(), costOfExtraMilk,
                CURRENCY_CODE);
    }

}
