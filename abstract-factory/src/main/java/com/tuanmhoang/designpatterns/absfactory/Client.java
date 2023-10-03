package com.tuanmhoang.designpatterns.absfactory;

import com.tuanmhoang.designpatterns.absfactory.maker.BunBoMaker;
import com.tuanmhoang.designpatterns.absfactory.maker.NoodlesMaker;
import com.tuanmhoang.designpatterns.absfactory.maker.PhoBoMaker;
import com.tuanmhoang.designpatterns.absfactory.maker.PhoGaMaker;

public class Client {
    public static void main(String[] args) {
        System.out.println(">>>>> Customer is ordering Bun bo...");
        NoodlesMaker bunBoMaker = new BunBoMaker();
        bunBoMaker.createNoodles();

        System.out.println(">>>>> Customer is ordering Pho bo...");
        NoodlesMaker phoBoMaker = new PhoBoMaker();
        phoBoMaker.createNoodles();

        System.out.println(">>>>> Customer is ordering Pho ga...");
        NoodlesMaker phoGaMaker = new PhoGaMaker();
        phoGaMaker.createNoodles();
    }
}
