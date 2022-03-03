package com.soj.cafe.shop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class Inventory {
    static final Logger logger= LogManager.getLogger(Inventory.class.getName());
    Map<String,Integer> inventoryMap=new HashMap<>();

     static  Inventory inventoryInstance ;

    private Inventory(){
        populateInventory();
    }

    public static Inventory getInstance(){
        if (inventoryInstance==null){
            inventoryInstance=new Inventory();
        }return inventoryInstance;

    }public void  populateInventory(){
        inventoryMap.put("Latte",20);
        inventoryMap.put("Americano",20);
        inventoryMap.put("Cappicino",20);
    }

    public void reduceBeans(String coffeeType){
        Integer availbleBeans=inventoryMap.get(coffeeType);
        if (availbleBeans>0){
            inventoryMap.put(coffeeType,availbleBeans-1);
            logger.debug("Available stock : {}" ,inventoryMap.get(coffeeType));
        }
        else {logger.debug("No Stock available");
    }
    }
}
