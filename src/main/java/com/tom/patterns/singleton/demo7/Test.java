package com.tom.patterns.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
//        write2File();
        SingletonLazy singletonLazy = readFromFile();
        System.out.println(singletonLazy);
    }

    public static SingletonLazy readFromFile() throws Exception {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("./test.txt"));
        SingletonLazy instance = (SingletonLazy) stream.readObject();
        stream.close();

        return instance;
    }

    public static void write2File() throws Exception {
        SingletonLazy instance = SingletonLazy.getInstance();
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("./test.txt"));
        stream.writeObject(instance);
        stream.close();
    }
}
