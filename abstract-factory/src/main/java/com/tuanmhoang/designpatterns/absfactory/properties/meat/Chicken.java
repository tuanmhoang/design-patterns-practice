package com.tuanmhoang.designpatterns.absfactory.properties.meat;

import com.tuanmhoang.designpatterns.absfactory.enums.MeatType;

public class Chicken implements  Meat{
    @Override
    public MeatType getMeat() {
        return MeatType.CHICKEN;
    }
}
