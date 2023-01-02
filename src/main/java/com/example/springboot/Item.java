package com.example.springboot;

public abstract class Item {

    private String description;

    String getDescription(){ return description;}

    abstract double price();
}
