package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.properties.meat.Chicken;
import com.tuanmhoang.designpatterns.absfactory.properties.meat.Meat;

public class PhoGaMaker extends PhoMaker{
    @Override
    Meat getMeat() {
        return new Chicken();
    }
}
