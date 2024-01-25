package com.example.s2699orderservice;


import java.util.ArrayList;
import java.util.List;
public class Order {
    public Client receiver;

    public Status orderStatus;
    public int orderID;
    public ItemStorage orderedItems;

    Order(Client receiver,Status orderStatus,int orderID,ItemStorage orderedItems){
        this.receiver = receiver;
        this.orderStatus = orderStatus;
        this.orderID = orderID;
        this.orderedItems = orderedItems;
    }
    public static void addItemToOrder(String itemName,int howMuch,Item orderedItem,Order order){
        if(Item.doesItemExist(itemName) && Item.doesItemQuantity(howMuch)){
            System.out.println("Dodano do zamowienia " + itemName + " w ilosci: " + howMuch);
            order.orderedItems.addItems(orderedItem);
        }
        else{
            System.out.println("Blad przy dodawaniu towaru");
        }
    }



}
