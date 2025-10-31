package com.tom.patterns.factory.simple;

public class StaticSimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equalsIgnoreCase("Americano")) {
            coffee = new Americano();
        } else if (type.equalsIgnoreCase("Latte")) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("Wrong type, sorry");
        }
        return coffee;
    }
}
