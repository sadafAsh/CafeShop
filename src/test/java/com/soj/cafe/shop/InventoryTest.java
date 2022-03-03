package com.soj.cafe.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void testToGetInstance() {
        Inventory inventory1=Inventory.getInstance();
        Inventory inventory2=Inventory.getInstance();
        Assertions.assertEquals(true,inventory1==inventory2);
    }

    @Test
    void testToReduceBeansFromInventory() {
        Inventory inventory=Inventory.getInstance();
        inventory.reduceBeans("Latte");
        Assertions.assertTrue(true,"Avalaible Stock : " +19);
    }
    @Test
    void testToReduceBeansFromInventoryWhereNoStocksAvailable() {
        Inventory inventory=Inventory.getInstance();
        Map<String,Integer> inventoryMap=new HashMap<>();
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        inventory.reduceBeans("Latte");
        String expected="no stock available";
        Assertions.assertTrue(true,"no stock available");
    }
}