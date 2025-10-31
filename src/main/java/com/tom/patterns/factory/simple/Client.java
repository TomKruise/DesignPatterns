package com.tom.patterns.factory.simple;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("americano");
        System.out.println(coffee.getName());

        coffee = store.orderStaticCoffee("latte");
        System.out.println(coffee.getName());
    }
}
