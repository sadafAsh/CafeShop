package com.soj.cafe.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LatteCoffeeTest {

    @Test
    void testToGetSize() {
        LatteCoffee coffee=new LatteCoffee("small");
        Assertions.assertEquals("small",coffee.getSize());
    }

    @Test
    void testToSetSize() {
        LatteCoffee coffee=new LatteCoffee("small");
        coffee.setSize("small");
        Assertions.assertEquals("small",coffee.getSize());
    }

    @Test
    void testToGetPriceByItsSize() {
        LatteCoffee coffee=new LatteCoffee("medium");

        int price=coffee.getPrice();
        Assertions.assertEquals(30,price);
    }

    @Test
    void testToPrintPrice() {
        LatteCoffee coffee=new LatteCoffee("small");


        int price=coffee.getPrice();
        String result=coffee.printPrice();

        String expected="Latte : The size is "+"small"+" , price : "+20;
        Assertions.assertEquals(expected,result);
    }

}