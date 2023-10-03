package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.products.meat.Meat;
import com.tuanmhoang.designpatterns.absfactory.products.noodles.Noodles;
import com.tuanmhoang.designpatterns.absfactory.products.noodles.Pho;
import com.tuanmhoang.designpatterns.absfactory.products.vegetables.PhoVegetables;
import com.tuanmhoang.designpatterns.absfactory.products.vegetables.Vegetables;

public abstract class PhoMaker extends NoodlesMaker{
    @Override
    Noodles getNoodles() {
        return new Pho();
    }

    abstract Meat getMeat();

    @Override
    Vegetables getVegetables() {
        return new PhoVegetables();
    }
}
