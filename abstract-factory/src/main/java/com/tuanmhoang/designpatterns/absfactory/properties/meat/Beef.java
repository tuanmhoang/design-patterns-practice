package com.tuanmhoang.designpatterns.absfactory.properties.meat;

import com.tuanmhoang.designpatterns.absfactory.enums.MeatType;

public class Beef implements Meat {
    @Override
    public MeatType getMeat() {
        return MeatType.BEEF;
    }
}
