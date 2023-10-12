package com.tuanmhoang.designpatterns.prototype;

import com.tuanmhoang.designpatterns.prototype.eager.EagerWaiter;
import com.tuanmhoang.designpatterns.prototype.lazy.LazyWaiter;

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(">>> Start Eager case");

        hiringProcess();
        EagerWaiter eagerWaiter = EagerWaiter.getInstance();
        System.out.println(">>> Done Eager case");

        /////
        System.out.println("**************************");
        /////

        System.out.println(">>> Start Lazy case");

        hiringProcess();

        LazyWaiter lazyWaiter = LazyWaiter.getInstance();
        System.out.println(">>> Done Lazy case");
    }

    private static void hiringProcess() throws InterruptedException {
        // Hiring process takes time
        Thread.sleep(2000);
    }
}
