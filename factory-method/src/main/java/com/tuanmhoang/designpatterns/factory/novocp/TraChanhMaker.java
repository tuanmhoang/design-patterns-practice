package com.tuanmhoang.designpatterns.factory.novocp;

import com.tuanmhoang.designpatterns.factory.NuocGiaiKhat;
import com.tuanmhoang.designpatterns.factory.TraChanh;

public class TraChanhMaker implements DrinkMaker{
    @Override
    public NuocGiaiKhat getNuocGiaiKhat() {
        return new TraChanh();
    }
}
