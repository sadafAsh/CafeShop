package com.soj.cafe.shop;

public class CoffeeFactory {

    public CoffeeType getCoffeeType(String type,String size){
        CoffeeType coffeeType;
        if (type.equalsIgnoreCase("Latte")){
            coffeeType=new LatteCoffee(size);
            return  coffeeType;
        }
        else if (type.equalsIgnoreCase("Americano")){
            coffeeType=new AmericanoCoffee(size);
            return coffeeType;
        }
        else if (type.equalsIgnoreCase("Cappicino")){
            coffeeType=new CappicinoCoffee(size);
            return coffeeType;
        }
        else return null;
    }
}
