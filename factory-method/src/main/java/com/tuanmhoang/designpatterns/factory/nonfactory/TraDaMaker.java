package com.tuanmhoang.designpatterns.factory.nonfactory;

import com.tuanmhoang.designpatterns.factory.NuocGiaiKhat;
import com.tuanmhoang.designpatterns.factory.TraDa;

public class TraDaMaker implements DrinkMaker{
    @Override
    public NuocGiaiKhat getNuocGiaiKhat() {
        return new TraDa();
    }
}
