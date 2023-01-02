package com.example.springboot;

import java.util.LinkedList;

public class Order {
    LinkedList items = new LinkedList();
    Payment payment;
    Delivery delivery;

    void setPaymentStrategy(Payment payment){

    }

    void setDeliveryStrategy(Delivery delivery){

    }

    double calculateTotalPrice(){
        return 0;
    }

    void processOrder(){

    }

    void addItem(Item item){

    }

    void removeItem(Item item){

    }
}
