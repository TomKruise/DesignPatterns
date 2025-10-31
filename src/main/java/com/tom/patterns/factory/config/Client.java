package com.tom.patterns.factory.config;

public class Client {
    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.createCoffee("americano");
        System.out.println(americano.getName());
    }
}
