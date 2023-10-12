package com.tuanmhoang.designpatterns.prototype.complex.products;

import com.tuanmhoang.designpatterns.prototype.enums.OptionalIngredients;

public class SupCuaBachThao extends SupCua {
    public SupCuaBachThao(SupCua target) {
        super(target);
        this.getOptionalIngredients().add(OptionalIngredients.TRUNG_BACH_THAO);
    }
}
