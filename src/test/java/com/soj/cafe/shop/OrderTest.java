package com.soj.cafe.shop;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testToGetCustomer() {
        Customer customer=new Customer("sunil");
        Order order=new Order(customer);
        Assertions.assertEquals(customer,order.getCustomer());
    }

    @Test
    void testToSetCustomer() {
        Customer customer=new Customer("sunil");
        Order order=new Order(customer);
        order.setCustomer(customer);
        Assertions.assertEquals(customer,order.getCustomer());
    }

    @Test
    void testToAddCoffeeType() {
        Customer customer=new Customer("sunil");
        Order order=new Order(customer);
        CoffeeType latte=new LatteCoffee("small");
        order.addCoffeeType(latte);
        Assertions.assertTrue(true,"coffe is added to an arraylist");

    }

    @Test
    void testToGetTotalCost() {
        Customer customer=new Customer("sunil");
        Order order=new Order(customer);
        List<CoffeeType> coffeeTypes=new ArrayList<>();
        CoffeeType latte=new LatteCoffee("small");
        int price=latte.getPrice();
        order.addCoffeeType(latte);
       int result= order.getTotalCost();
        Assertions.assertEquals(20,result);
    }
}