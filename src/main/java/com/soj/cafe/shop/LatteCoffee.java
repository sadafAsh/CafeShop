package com.soj.cafe.shop;

import java.util.HashMap;
import java.util.Map;

public class LatteCoffee implements CoffeeType {
    private String size;
    Map<String ,Integer> latteMap=new HashMap<>();

    public LatteCoffee(String size) {
        this.size = size;
        populatePrice();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private void populatePrice() {
        latteMap.put("small", 20);
        latteMap.put("medium", 30);
        latteMap.put("large", 40);
    }

    @Override
    public int getPrice() {
        return latteMap.get(size);
    }

    @Override
    public String printPrice() {
        return "Latte : The size is "+size+" , price : "+getPrice();

    }
}
