package com.tom.patterns.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if (type.equalsIgnoreCase("Americano")) {
            coffee = new Americano();
        } else if (type.equalsIgnoreCase("Latte")) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("Wrong type, sorry");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
