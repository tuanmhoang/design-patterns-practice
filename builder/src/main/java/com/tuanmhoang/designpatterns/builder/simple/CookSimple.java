package com.tuanmhoang.designpatterns.builder.simple;

import com.tuanmhoang.designpatterns.builder.simple.builder.BunBoSimpleBuilder;
import com.tuanmhoang.designpatterns.builder.simple.products.BunBoSimple;
import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.List;

public class CookSimple {
    public static void main(String[] args) {
        BunBoSimpleBuilder builder = new BunBoSimpleBuilder();
        BunBoSimple bunBoSimple1 = builder.addNoodles(NoodlesType.BUN)
            .addMeat(List.of(Meat.THIT_BO,Meat.GIO_HEO))
            .addVegetables(List.of(Vegetables.GIA,Vegetables.RAU_MUONG_BAO))
            .addFlavor(List.of(Flavor.OT_SA_TE, Flavor.NUOC_MAM))
            .build();
        bunBoSimple1.printIngredients();
    }
}
