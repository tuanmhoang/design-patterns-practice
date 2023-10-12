package com.tuanmhoang.designpatterns.prototype.eager;

public class EagerWaiter {
    private static final EagerWaiter INSTANCE = new EagerWaiter();

    private EagerWaiter() {
        System.out.println("Ann is hired!");
    }

    public static EagerWaiter getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Open a restaurant.");
        hiringProcess();
        // Access the instance.
        EagerWaiter waiter1 = EagerWaiter.getInstance();
        EagerWaiter waiter2 = EagerWaiter.getInstance();

        System.out.println("Are the waiters the same: " + waiter1.equals(waiter2));
    }

    private static void hiringProcess() throws InterruptedException {
        System.out.println("Hiring process...");
        Thread.sleep(2000);
    }
}
