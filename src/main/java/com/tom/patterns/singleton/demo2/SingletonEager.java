package com.tom.patterns.singleton.demo2;

public class SingletonEager {
    private SingletonEager() {}

    private static SingletonEager instance;

    static {
        instance = new SingletonEager();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
