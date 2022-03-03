package com.soj.cafe.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AmericanoCoffeeTest {

    @Test
    void testToGetSize() {
        AmericanoCoffee coffee=new AmericanoCoffee("small");
        Assertions.assertEquals("small",coffee.getSize());
    }

    @Test
    void testToSetSize() {
        AmericanoCoffee coffee=new AmericanoCoffee("small");
        coffee.setSize("small");
        Assertions.assertEquals("small",coffee.getSize());
    }

    @Test
    void testToGetPriceByItsSize() {
        AmericanoCoffee coffee=new AmericanoCoffee("small");

        int price=coffee.getPrice();
        Assertions.assertEquals(20,price);
    }

    @Test
    void testToPrintPrice() {
        AmericanoCoffee coffee=new AmericanoCoffee("small");

        String result=coffee.printPrice();

        String expected="Americano : The size is "+"small"+" , price : "+20;
        Assertions.assertEquals(expected,result);
    }
}