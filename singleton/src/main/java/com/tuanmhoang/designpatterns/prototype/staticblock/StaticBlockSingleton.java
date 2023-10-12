package com.tuanmhoang.designpatterns.prototype.staticblock;

public class StaticBlockSingleton {
 
    private static final StaticBlockSingleton INSTANCE;
 
    private StaticBlockSingleton() {
    }
 
    // Static block initialization for exception handling
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
 
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}