package com.example.s2699orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S2699OrderServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(S2699OrderServiceApplication.class, args);
        initProcess();
    }
    public static void initProcess(){
        Item jablko = new Item("Jablko",20);
        Item gruszka = new Item("Gruszka",10);
        Item.addItem(jablko);
        Item.addItem(gruszka);
        Item.showAllItems();
        Adress adresMariusza = new Adress("Gdansk","Willanowska","80-175","42A","22");
        Client Mariusz = new Client(20,adresMariusza);
        ItemStorage itemStorage1 = new ItemStorage();
        Order order1 = new Order(Mariusz,Status.NEW,1,itemStorage1);
        Order.addItemToOrder("Jablko",10,jablko,order1);
        Item.showAllItems();
        Order.addItemToOrder("Jablko",3,jablko,order1);
        Item.showAllItems();
        ItemStorage.showOrderedItems(order1);
    }

}
