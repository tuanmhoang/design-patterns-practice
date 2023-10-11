package com.tuanmhoang.designpatterns.absfactory.properties.vegetables;

import com.tuanmhoang.designpatterns.absfactory.enums.VegetablesType;
import java.util.List;

public class PhoVegetables implements Vegetables {
    @Override
    public List<VegetablesType> getVegetables() {
        return List.of(VegetablesType.GIA, VegetablesType.QUE, VegetablesType.NGO_GAI);
    }
}
