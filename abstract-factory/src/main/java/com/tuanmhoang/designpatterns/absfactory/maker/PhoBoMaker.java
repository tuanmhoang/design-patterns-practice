package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.properties.meat.Beef;
import com.tuanmhoang.designpatterns.absfactory.properties.meat.Meat;

public class PhoBoMaker extends PhoMaker{
    @Override
    Meat getMeat() {
        return new Beef();
    }
}
