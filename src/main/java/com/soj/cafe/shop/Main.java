package com.soj.cafe.shop;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
        Customer customer=new Customer("asif");
        Order order=new Order(customer);
        Inventory inventory=Inventory.getInstance();
        CoffeeFactory factory=new CoffeeFactory();
        CoffeeType latte=factory.getCoffeeType("Latte","small");
        CoffeeType cappicino=factory.getCoffeeType("Cappicino","large");
        order.addCoffeeType(latte);
        order.addCoffeeType(cappicino);
        String printPrice=latte.printPrice();
        logger.debug(printPrice);
        String printPrice1=cappicino.printPrice();
        logger.debug(printPrice1);
        logger.debug("TotalCost :{}",order.getTotalCost());
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Cappicino");

    }

}