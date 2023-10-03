package com.tuanmhoang.designpatterns.absfactory.products.vegetables;

import com.tuanmhoang.designpatterns.absfactory.enums.VegetablesType;
import java.util.List;

public interface Vegetables {
    List<VegetablesType> getVegetables();
}
