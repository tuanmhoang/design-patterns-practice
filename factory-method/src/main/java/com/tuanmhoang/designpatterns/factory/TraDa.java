package com.tuanmhoang.designpatterns.factory;

public class TraDa implements NuocGiaiKhat{
    public void makeDrink() {
        System.out.println("Making Tra da...");

        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Done making Tra da! Pha Tra da het: " + duration);
    }
}
