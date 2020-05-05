package com.wgcisotto.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber){
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process(){
        orders.forEach(Order::processOrder);
        orders.forEach(orders::remove);
    }

    String report(){
        return "Total Item objects made: "
                + catalog.totalItemsMade();
    }


}
