package com.soj.cafe.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeFactoryTest {

    @Test
    void testToGetLatteCoffeeType() {
        CoffeeFactory coffeeFactory=new CoffeeFactory();

       CoffeeType latte= coffeeFactory.getCoffeeType("Latte","small");
        Assertions.assertTrue(latte instanceof LatteCoffee);
    }
    @Test
    void testToGetAmericanoCoffeeType() {
        CoffeeFactory coffeeFactory=new CoffeeFactory();

        CoffeeType americano= coffeeFactory.getCoffeeType("Americano","small");
        Assertions.assertTrue(americano instanceof AmericanoCoffee);
    }

    @Test
    void testToGetCappicinoCoffeeType() {
        CoffeeFactory coffeeFactory=new CoffeeFactory();

        CoffeeType cappicino= coffeeFactory.getCoffeeType("Cappicino","small");
        Assertions.assertTrue(cappicino instanceof CappicinoCoffee);
    }
    @Test
    void testToGetTheCoffeeTypeNull() {
        CoffeeFactory coffeeFactory=new CoffeeFactory();

        CoffeeType result= coffeeFactory.getCoffeeType("null","small");
        Assertions.assertNull(result);
    }
}