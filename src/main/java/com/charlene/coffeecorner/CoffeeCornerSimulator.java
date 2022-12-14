package com.charlene.coffeecorner;

import com.charlene.coffeecorner.beverage.*;
import com.charlene.coffeecorner.beverage.extras.ExtraMilk;
import com.charlene.coffeecorner.beverage.extras.SpecialRoastCoffee;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class CoffeeCornerSimulator {

    final static private Currency localCurrency = Currency.getInstance("CHF");

    public CoffeeCornerSimulator() {
        final Locale deCHLocale = new Locale("de-CH");
    }

    public static void main(String[] args) {
        // Your task is to:
        //Write a simple program whose output is formatted like a receipt you would receive at a supermarket.
        //The input to the program is a list of products the shopper wants to purchase
        // (large coffee with extra milk, small coffee with special roast,
        //bacon roll, orange juice)

        ArrayList<MenuItem> order = new ArrayList<>();

        Beverage beverageItem = new Coffee(Coffee.SIZE.LARGE);
        beverageItem = new ExtraMilk(beverageItem);
        // add one beverage to oder
        order.add(beverageItem);

        beverageItem = new Coffee(Coffee.SIZE.SMALL);
        beverageItem = new SpecialRoastCoffee(beverageItem);
        // add another beverage to order
        order.add(beverageItem);

        // add Bacon roll
        BaconRoll baconRoll = new BaconRoll();
        order.add(baconRoll);

        OrangeJuice orangeJuice = new OrangeJuice();
        order.add(orangeJuice);
        // now print order
        printOrder(order);
    }

    static void printOrder(List<MenuItem> order) {
        double totalBillingAmount = 0;
        // use iterator to loop through same type of objects
        for (MenuItem beverage : order) {
            System.out.printf("\n1%s\t\t\t", beverage.getDescription());
            System.out.printf("\n\t\t\t\t\t\t\t(%.2f%s)", beverage.getCost(), localCurrency.getCurrencyCode());
            totalBillingAmount += beverage.getCost();
        }

        System.out.printf("\nTOTAL:\t\t\t\t\t\t%.2f%s", totalBillingAmount, localCurrency.getCurrencyCode());
    }
}
