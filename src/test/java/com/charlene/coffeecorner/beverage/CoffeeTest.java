package com.charlene.coffeecorner.beverage;

import com.charlene.coffeecorner.beverage.Coffee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {

    @Test
    void should_ReturnCorrectCost_When_CofeeSizeIsSmall() {
        assertEquals(2.50, new Coffee(Coffee.SIZE.SMALL).getCost());
    }

    @Test
    void should_ReturnCorrectCost_When_CofeeSizeIsSMedium() {
        assertEquals(3.00, new Coffee(Coffee.SIZE.MEDIUM).getCost());
    }

    @Test
    void should_ReturnCorrectCost_When_CofeeSizeIsLarge() {
        assertEquals(3.50, new Coffee(Coffee.SIZE.LARGE).getCost());
    }

    @Test
    void should_ReturnCorrectDescription_When_CofeeSizeIsSmall() {
        assertEquals("House Coffee small\t\t\t2.50CHF", new Coffee(Coffee.SIZE.SMALL).getDescription());
    }

    @Test
    void should_ReturnCorrectDescription_When_CofeeSizeIsMedium() {
        assertEquals("House Coffee medium\t\t\t3.00CHF", new Coffee(Coffee.SIZE.MEDIUM).getDescription());
    }

    @Test
    void should_ReturnCorrectDescription_When_CofeeSizeIsLarge() {
        assertEquals("House Coffee large\t\t\t3.50CHF", new Coffee(Coffee.SIZE.LARGE).getDescription());
    }
}
