package com.tom.patterns.singleton.demo1;

public class SingletonEager {
    private SingletonEager() {}

    private static SingletonEager instance = new SingletonEager();

    public static SingletonEager getInstance() {
        return instance;
    }
}
