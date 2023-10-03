package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.products.meat.Beef;
import com.tuanmhoang.designpatterns.absfactory.products.meat.Meat;

public class PhoBoMaker extends PhoMaker{
    @Override
    Meat getMeat() {
        return new Beef();
    }
}
