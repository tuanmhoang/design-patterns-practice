package com.tuanmhoang.designpatterns.builder.simple.builder;

import com.tuanmhoang.designpatterns.builder.simple.products.BunBoSimple;
import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.List;

public class BunBoSimpleBuilder {
    private NoodlesType noodles;

    private List<Meat> meat;

    private List<Vegetables> vegetables;

    private List<Flavor> flavor;

    public NoodlesType getNoodles() {
        return noodles;
    }

    public BunBoSimpleBuilder addNoodles(NoodlesType noodles) {
        this.noodles = noodles;
        return this;
    }

    public List<Meat> getMeat() {
        return meat;
    }

    public BunBoSimpleBuilder addMeat(List<Meat> meat) {
        this.meat = meat;
        return this;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public BunBoSimpleBuilder addVegetables(List<Vegetables> vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    public List<Flavor> getFlavor() {
        return flavor;
    }

    public BunBoSimpleBuilder addFlavor(List<Flavor> flavor) {
        this.flavor = flavor;
        return this;
    }

    public BunBoSimple build() {
        return new BunBoSimple(
            noodles,
            meat,
            vegetables,
            flavor
        );
    }

}
