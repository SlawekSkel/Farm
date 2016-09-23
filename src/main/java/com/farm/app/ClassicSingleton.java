package com.farm.app;

/**
 * Created by slawekskel on 9/20/16.
 */
public class ClassicSingleton {


    private static ClassicSingleton instance = null;

    protected ClassicSingleton() {
        // Exists only to defeat instantiation.
    }


    public static ClassicSingleton getInstance() {
        if(instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }


}
