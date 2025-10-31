package com.tom.patterns.singleton.demo1;

public class Test {
    public static void main(String[] args) {
        SingletonEager instance = SingletonEager.getInstance();
        SingletonEager instance2 = SingletonEager.getInstance();

        System.out.println(instance == instance2);
    }
}
