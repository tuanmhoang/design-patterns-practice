package com.tuanmhoang.designpatterns.factory;

public class TraChanh implements NuocGiaiKhat {
    public void makeDrink() {
        System.out.println("Making Tra chanh...");

        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Done making Tra chanh! Pha Tra chanh het: " + duration);
    }
}
