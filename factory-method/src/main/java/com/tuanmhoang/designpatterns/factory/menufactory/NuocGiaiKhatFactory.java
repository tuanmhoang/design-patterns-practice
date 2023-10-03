package com.tuanmhoang.designpatterns.factory.menufactory;

import com.tuanmhoang.designpatterns.factory.NuocGiaiKhat;
import com.tuanmhoang.designpatterns.factory.TraChanh;
import com.tuanmhoang.designpatterns.factory.TraDa;
import com.tuanmhoang.designpatterns.factory.menu.Menu;

public class NuocGiaiKhatFactory {
    public NuocGiaiKhat getNuocGiaiKhat(Menu menu){
        switch (menu){
            case TRA_DA:
                return new TraDa();
            case TRA_CHANH:
                return new TraChanh();
            default:
                throw new IllegalArgumentException("Unknown drink!!! Uong vo dau bung do!");
        }
    }
}
