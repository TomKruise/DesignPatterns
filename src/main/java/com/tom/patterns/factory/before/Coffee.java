package com.tom.patterns.factory.before;

public abstract class Coffee {
    abstract String getName();
    void addMilk() {
        System.out.println("add milk");
    }

    void addSugar() {
        System.out.println("add sugar");
    }
}
