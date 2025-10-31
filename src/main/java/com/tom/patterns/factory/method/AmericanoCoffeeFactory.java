package com.tom.patterns.factory.method;

public class AmericanoCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
