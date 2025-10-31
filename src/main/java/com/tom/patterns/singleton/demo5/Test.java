package com.tom.patterns.singleton.demo5;

public class Test {
    public static void main(String[] args) {
        SingletonLazy instance = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance == instance2);
    }
}