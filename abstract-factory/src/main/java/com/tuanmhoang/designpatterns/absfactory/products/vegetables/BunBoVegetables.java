package com.tuanmhoang.designpatterns.absfactory.products.vegetables;

import com.tuanmhoang.designpatterns.absfactory.enums.VegetablesType;
import java.util.List;

public class BunBoVegetables implements Vegetables {
    @Override
    public List<VegetablesType> getVegetables() {
        return List.of(VegetablesType.GIA, VegetablesType.QUE, VegetablesType.HOA_CHUOI, VegetablesType.RAU_MUONG_BAO);
    }
}
