package com.tuanmhoang.designpatterns.builder.complex.builder;

import com.tuanmhoang.designpatterns.builder.complex.product.Noodles;
import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.List;

public interface NoodlesBuilder {
    NoodlesBuilder addNoodles(NoodlesType noodlesType);
    NoodlesBuilder addMeat(List<Meat> meat);
    NoodlesBuilder addVegetables(List<Vegetables> vegetables);
    NoodlesBuilder addFlavors(List<Flavor> flavors);
    Noodles cook();
}
