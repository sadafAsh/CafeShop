package com.soj.cafe.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CappicinoCoffeeTest {

    @Test
    void testToGetSize() {
        CappicinoCoffee cappicino=new CappicinoCoffee("small");
        Assertions.assertEquals("small",cappicino.getSize());
    }

    @Test
    void testToSetSize() {
        CappicinoCoffee cappicino=new CappicinoCoffee("small");
        cappicino.setSize("small");
        Assertions.assertEquals("small",cappicino.getSize());
    }

    @Test
    void testToGetPriceByItsSize() {
        CappicinoCoffee cappicino=new CappicinoCoffee("small");

        int price=cappicino.getPrice();
        Assertions.assertEquals(20,price);
    }

    @Test
    void testToPrintPrice() {
        CappicinoCoffee cappicino=new CappicinoCoffee("small");

        int price=cappicino.getPrice();
        String result=cappicino.printPrice();

        String expected="Cappicino : The size is "+"small"+" , price : "+20;
        Assertions.assertEquals(expected,result);
    }
}