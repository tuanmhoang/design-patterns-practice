package com.tuanmhoang.designpatterns.absfactory.products.meat;

import com.tuanmhoang.designpatterns.absfactory.enums.MeatType;

public class Chicken implements  Meat{
    @Override
    public MeatType getMeat() {
        return MeatType.CHICKEN;
    }
}
