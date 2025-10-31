package com.tom.patterns.factory.abstract_;

public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
