package com.tuanmhoang.designpatterns.prototype.lazy;

import com.tuanmhoang.designpatterns.prototype.eager.EagerWaiter;

public class LazyWaiter {
    private static LazyWaiter instance;
    private LazyWaiter() {
        System.out.println("Bob is hired!");
    }
    public static LazyWaiter getInstance() {
        if (instance == null) {
            instance = new LazyWaiter();
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Open a restaurant.");
        hiringProcess();
        // Access the instance.
        LazyWaiter waiter1 = LazyWaiter.getInstance();
        LazyWaiter waiter2 = LazyWaiter.getInstance();

        System.out.println("Are the waiters the same: " + waiter1.equals(waiter2));
    }

    private static void hiringProcess() throws InterruptedException {
        System.out.println("Hiring process...");
        Thread.sleep(2000);
    }
}
