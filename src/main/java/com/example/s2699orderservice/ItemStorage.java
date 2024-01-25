package com.example.s2699orderservice;

import java.util.ArrayList;
import java.util.List;

public class ItemStorage {
    public static List<Item> orderedItems = new ArrayList<>();
    public Item item;

    public void addItems(Item item){
        orderedItems.add(item);
    }
    public static void showOrderedItems(Order orderPlaced){
        int i = 0;
        System.out.println("Zawartosc zamowienia nr"+ orderPlaced.orderID +". :");
        for(Item currentItem : orderedItems){
            System.out.println((i+1) +". "+ currentItem.getName() +", ilosc: "+ currentItem.getQuantity() );
            i++;
        }
    }
}
