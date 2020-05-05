package com.wgcisotto.structural.flyweight;

import com.wgcisotto.structural.flyweight.InventorySystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightInventoryTest {

    @Test
    public void run(){
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Roomba", 563);
        inventorySystem.takeOrder("Roomba", 234);
        inventorySystem.takeOrder("Roomba", 256);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Bose Headphones", 321);
        inventorySystem.takeOrder("Bose Headphones", 365);
        inventorySystem.takeOrder("Samsung TV", 432);
        inventorySystem.takeOrder("Samsung TV", 323);
        inventorySystem.takeOrder("Samsung TV", 54);
        inventorySystem.takeOrder("Samsung TV", 332);

        inventorySystem.process();

        System.out.println(inventorySystem.report());

        assertEquals("Total Item objects made: 3", inventorySystem.report());


    }

}
