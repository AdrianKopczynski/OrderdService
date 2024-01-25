package com.example.s2699orderservice;

import java.util.ArrayList;
import java.util.List;
public class Item {
    public String name;
    public int quantity;

    Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    public String getName(){

        return name;
    }
    public void setName(){
        this.name = name;
    }

    public int getQuantity(){

        return quantity;
    }
    public void setQuantity(){
        this.quantity = quantity;
    }

    static List<Item> allItems = new ArrayList<>();
    public static void addItem(Item newItem){
        allItems.add(newItem);
    }
    public static boolean doesItemExist(String itemName) {
        for (Item item : allItems) {
            if (item.name.equals(itemName)) {
                return true;
            }
        }
        System.out.println("Brak towaru o podanej nazwie");
        return false;
    }
    public static boolean doesItemQuantity(int itemQuantity) {
        for (Item item : allItems) {
            if (item.quantity > itemQuantity) {
                item.quantity -= itemQuantity;
                return true;
            }
        }
        System.out.println("Brak wskazanej ilosci towaru na stanie");
        return false;
    }
    public static void showAllItems(){
        int i = 1;
        System.out.println("Dostepne produkty: ");
        for (Item item: allItems){
            System.out.println(i+". "+ item.name +", ilosc: "+item.quantity );
            i++;
        }
    }

}
