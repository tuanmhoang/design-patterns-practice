package com.tuanmhoang.designpatterns.factory.menufactory;

import com.tuanmhoang.designpatterns.factory.NuocGiaiKhat;
import com.tuanmhoang.designpatterns.factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
        NuocGiaiKhatFactory factory = new NuocGiaiKhatFactory();

        NuocGiaiKhat traChanh = factory.getNuocGiaiKhat(Menu.TRA_CHANH);
        traChanh.makeDrink();

        NuocGiaiKhat traDa = factory.getNuocGiaiKhat(Menu.TRA_DA);
        traDa.makeDrink();
    }
}
