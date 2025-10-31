package com.tom.patterns.singleton.demo4;

public class SingletonLazy {
    private SingletonLazy() {};

    private static volatile SingletonLazy instance;

    public static synchronized SingletonLazy getInstance() {

        if (null == instance) {
            synchronized (SingletonLazy.class) {
                if (null == instance) {
                    instance = new SingletonLazy();
                }
            }
        }

        return instance;
    }
}