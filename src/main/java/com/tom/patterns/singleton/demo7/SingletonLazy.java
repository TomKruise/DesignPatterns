package com.tom.patterns.singleton.demo7;

import java.io.Serializable;

public class SingletonLazy implements Serializable {
    private SingletonLazy() {}

    private static class SingletonHolder {
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance() {

        return SingletonHolder.INSTANCE;
    }

    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}