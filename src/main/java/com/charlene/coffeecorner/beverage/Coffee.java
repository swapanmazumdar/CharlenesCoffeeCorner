package com.charlene.coffeecorner.beverage;

import static com.charlene.coffeecorner.Store.DEFAULT_CURRENCY_CODE;

public class Coffee extends Beverage {
    private final String description = "House Coffee";
    private SIZE size;

    public Coffee(SIZE size) {
        this.size = size;
    }

    public enum SIZE {
        // extract these out to DAO
        SMALL("small"),
        MEDIUM("medium"),
        LARGE("large");
        private final String size;

        SIZE(String size) {
            this.size = size;
        }
    }

    @Override
    public String getDescription() {
        // TODO refactor to decorate with currency code
        return String.format("%s %s\t\t\t%.2f%s", description, size.toString().toLowerCase(), getCost(), DEFAULT_CURRENCY_CODE);
    }

    @Override
    public double getCost() {
        final double cost;
        switch (size) {
            case SMALL:
                cost = 2.50;
                break;
            case MEDIUM:
                cost = 3.00;
                break;
            case LARGE:
                cost = 3.50;
                break;
            default:
                throw new IllegalArgumentException("Unknown coffee size");
        }
        return cost;
    }

}