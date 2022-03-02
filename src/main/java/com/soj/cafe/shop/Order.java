package com.soj.cafe.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<CoffeeType> coffeeTypes=new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addCoffeeType(CoffeeType coffeeType){
        coffeeTypes.add(coffeeType);
    }

    public int getTotalCost(){
        return coffeeTypes.stream()
                .mapToInt(CoffeeType::getPrice)
                .sum();
    }


}
