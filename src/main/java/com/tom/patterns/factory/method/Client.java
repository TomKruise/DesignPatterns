package com.tom.patterns.factory.method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setFactory(new AmericanoCoffeeFactory());
        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());

        store.setFactory(new LatteCoffeeFactory());
        coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
