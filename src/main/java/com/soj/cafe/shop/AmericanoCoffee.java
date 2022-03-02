package com.soj.cafe.shop;

import java.util.HashMap;
import java.util.Map;

public class AmericanoCoffee implements CoffeeType {

    private  String size;
    Map<String ,Integer> americanoMap=new HashMap<>();

    public AmericanoCoffee(String size) {
        this.size = size;
        populatePrice();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        populatePrice();
    }

    public void populatePrice(){
        americanoMap.put("small", 20);
        americanoMap.put("medium", 30);
        americanoMap.put("large", 40);
    }
    @Override
    public int getPrice() {
        return americanoMap.get(size);
    }

    @Override
    public String printPrice() {
        return "Americano : The size is "+size+" , price : "+getPrice();

    }
}
