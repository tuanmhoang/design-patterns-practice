package com.tuanmhoang.designpatterns.builder.complex;

import com.tuanmhoang.designpatterns.builder.complex.builder.BunBoBuilder;
import com.tuanmhoang.designpatterns.builder.complex.builder.NoodlesBuilder;
import com.tuanmhoang.designpatterns.builder.complex.builder.PhoBuilder;
import com.tuanmhoang.designpatterns.builder.complex.product.Noodles;
import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.List;

public class Cook {
    public static void main(String[] args) {
        NoodlesBuilder bunBoBuilder = new BunBoBuilder();
        Noodles bunBo = bunBoBuilder
            .addNoodles(NoodlesType.BUN)
            .addMeat(List.of(Meat.THIT_BO,Meat.GIO_HEO))
            .addVegetables(List.of(Vegetables.RAU_MUONG_BAO,Vegetables.GIA))
            .cook();
        bunBo.printIngredients();

        NoodlesBuilder phoBuilder = new PhoBuilder();
        Noodles pho = phoBuilder
            .addNoodles(NoodlesType.PHO)
            .addMeat(List.of(Meat.THIT_BO,Meat.THIT_GA))
            .addVegetables(List.of(Vegetables.GIA,Vegetables.HANH))
            .addFlavors(List.of(Flavor.CHANH,Flavor.TIEU))
            .cook();
        pho.printIngredients();
    }
}
