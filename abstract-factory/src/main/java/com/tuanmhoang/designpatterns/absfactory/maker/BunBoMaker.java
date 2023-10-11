package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.properties.meat.Beef;
import com.tuanmhoang.designpatterns.absfactory.properties.meat.Meat;
import com.tuanmhoang.designpatterns.absfactory.properties.noodles.BunBo;
import com.tuanmhoang.designpatterns.absfactory.properties.noodles.Noodles;
import com.tuanmhoang.designpatterns.absfactory.properties.vegetables.BunBoVegetables;
import com.tuanmhoang.designpatterns.absfactory.properties.vegetables.Vegetables;

public class BunBoMaker extends NoodlesMaker{
    @Override
    Noodles getNoodles() {
        return new BunBo();
    }

    @Override
    Meat getMeat() {
        return new Beef();
    }

    @Override
    Vegetables getVegetables() {
        return new BunBoVegetables();
    }
}
