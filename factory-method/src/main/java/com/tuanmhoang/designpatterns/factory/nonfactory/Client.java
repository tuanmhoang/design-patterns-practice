package com.tuanmhoang.designpatterns.factory.nonfactory;

import com.tuanmhoang.designpatterns.factory.NuocGiaiKhat;

public class Client {
    public static void main(String[] args) {
        DrinkMaker traDaMaker = new TraDaMaker();
        NuocGiaiKhat traDa = traDaMaker.getNuocGiaiKhat();
        traDa.makeDrink();

        DrinkMaker traChanhMaker = new TraChanhMaker();
        NuocGiaiKhat traChanh = traChanhMaker.getNuocGiaiKhat();
        traChanh.makeDrink();
    }
}
