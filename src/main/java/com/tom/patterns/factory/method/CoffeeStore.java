package com.tom.patterns.factory.method;

import com.tom.patterns.factory.simple.SimpleCoffeeFactory;
import com.tom.patterns.factory.simple.StaticSimpleCoffeeFactory;

public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
