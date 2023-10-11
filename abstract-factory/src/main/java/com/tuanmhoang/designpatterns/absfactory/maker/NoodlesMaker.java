package com.tuanmhoang.designpatterns.absfactory.maker;

import com.tuanmhoang.designpatterns.absfactory.properties.meat.Meat;
import com.tuanmhoang.designpatterns.absfactory.properties.noodles.Noodles;
import com.tuanmhoang.designpatterns.absfactory.properties.vegetables.Vegetables;

public abstract class NoodlesMaker {
    abstract Noodles getNoodles();

    abstract Meat getMeat();

    abstract Vegetables getVegetables();

    public void createNoodles(){
        System.out.println("> Taking noodles...");
        Noodles noodles = getNoodles();
        System.out.println(noodles.getNoodles().name());

        System.out.println("> Taking meat...");
        Meat meat = getMeat();
        System.out.println(meat.getMeat().name());

        System.out.println("> Taking vegetables...");
        Vegetables vegetables = getVegetables();
        vegetables.getVegetables()
            .stream()
            .map(vegetablesType -> vegetablesType.name())
            .forEach(v -> System.out.println(v));
    }
}
