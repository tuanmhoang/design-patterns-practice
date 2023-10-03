package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.products.meat.Chicken;
import com.tuanmhoang.designpatterns.absfactory.products.meat.Meat;

public class PhoGaMaker extends PhoMaker{
    @Override
    Meat getMeat() {
        return new Chicken();
    }
}
