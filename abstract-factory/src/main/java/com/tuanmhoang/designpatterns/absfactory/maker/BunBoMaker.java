package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.products.meat.Beef;
import com.tuanmhoang.designpatterns.absfactory.products.meat.Meat;
import com.tuanmhoang.designpatterns.absfactory.products.noodles.BunBo;
import com.tuanmhoang.designpatterns.absfactory.products.noodles.Noodles;
import com.tuanmhoang.designpatterns.absfactory.products.vegetables.BunBoVegetables;
import com.tuanmhoang.designpatterns.absfactory.products.vegetables.Vegetables;

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
