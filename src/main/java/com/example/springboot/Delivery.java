package com.example.springboot;

import java.util.LinkedList;

public interface Delivery {

    default void deliver(LinkedList items){

    }

}
