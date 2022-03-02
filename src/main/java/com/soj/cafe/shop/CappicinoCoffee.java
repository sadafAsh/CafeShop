package com.soj.cafe.shop;

import java.util.HashMap;
import java.util.Map;

public class CappicinoCoffee implements CoffeeType {
    private String size;
    Map<String,Integer> cappicinoMap=new HashMap<>();

    public CappicinoCoffee(String size) {
        this.size = size;
        populatePrice();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void populatePrice(){
        cappicinoMap.put("small",20);
        cappicinoMap.put("medium" ,40);
        cappicinoMap.put("large",50);
    }

    @Override
    public int getPrice() {
        return cappicinoMap.get(size);
    }

    @Override
    public String printPrice() {
return "Cappicino : The size is "+size+" , price : "+getPrice();
    }
}
