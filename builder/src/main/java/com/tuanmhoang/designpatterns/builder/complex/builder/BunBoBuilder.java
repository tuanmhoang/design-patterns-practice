package com.tuanmhoang.designpatterns.builder.complex.builder;

import com.tuanmhoang.designpatterns.builder.complex.product.BunBo;
import com.tuanmhoang.designpatterns.builder.complex.product.Noodles;
import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.ArrayList;
import java.util.List;

public class BunBoBuilder implements NoodlesBuilder {
    private NoodlesType noodlesType;

    private List<Meat> meat;

    private List<Vegetables> vegetables;

    private List<Flavor> flavors;

    public BunBoBuilder(){
        this.meat = new ArrayList<>();
        this.vegetables = new ArrayList<>();
        this.flavors = new ArrayList<>();
    }

    @Override
    public NoodlesBuilder addNoodles(NoodlesType noodlesType) {
        this.noodlesType = noodlesType;
        return this;
    }

    @Override
    public NoodlesBuilder addMeat(List<Meat> meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public NoodlesBuilder addVegetables(List<Vegetables> vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    @Override
    public NoodlesBuilder addFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    @Override
    public Noodles cook() {
        return new BunBo(
            this.noodlesType,
            this.meat,
            this.vegetables,
            this.flavors
        );
    }
}
