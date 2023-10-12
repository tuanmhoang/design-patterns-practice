package com.tuanmhoang.designpatterns.prototype.complex.products;

import com.tuanmhoang.designpatterns.prototype.enums.OptionalIngredients;
import java.util.List;

public class SupCuaOcHeo extends SupCua {
    public SupCuaOcHeo(SupCua target) {
        super(target);
        this.getOptionalIngredients().add(OptionalIngredients.OC_HEO);
    }
}
