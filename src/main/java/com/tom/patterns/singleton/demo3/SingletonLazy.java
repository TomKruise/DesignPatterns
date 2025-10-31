package com.tom.patterns.singleton.demo3;

public class SingletonLazy {
    private SingletonLazy() {};

    private static SingletonLazy instance;

    public static synchronized SingletonLazy getInstance() {

        if (null == instance) {
            instance = new SingletonLazy();
        }

        return instance;
    }
}
