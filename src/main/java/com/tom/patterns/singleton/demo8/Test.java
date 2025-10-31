package com.tom.patterns.singleton.demo8;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singletonLazy = constructor.newInstance();
        Singleton instance = constructor.newInstance();

        System.out.println(instance == singletonLazy);
    }
}
