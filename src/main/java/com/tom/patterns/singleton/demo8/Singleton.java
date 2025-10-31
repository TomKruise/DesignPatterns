package com.tom.patterns.singleton.demo8;

public class Singleton {

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("Can not create multy objects!");
            }

            flag = true;
        }

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {

        return SingletonHolder.INSTANCE;
    }
}