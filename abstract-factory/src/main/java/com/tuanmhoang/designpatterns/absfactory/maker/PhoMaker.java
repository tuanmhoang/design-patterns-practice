package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.properties.meat.Meat;
import com.tuanmhoang.designpatterns.absfactory.properties.noodles.Noodles;
import com.tuanmhoang.designpatterns.absfactory.properties.noodles.Pho;
import com.tuanmhoang.designpatterns.absfactory.properties.vegetables.PhoVegetables;
import com.tuanmhoang.designpatterns.absfactory.properties.vegetables.Vegetables;

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
