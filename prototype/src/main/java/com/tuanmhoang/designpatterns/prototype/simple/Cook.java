package com.tuanmhoang.designpatterns.prototype.simple;

import com.tuanmhoang.designpatterns.prototype.enums.OptionalIngredients;

import com.tuanmhoang.designpatterns.prototype.enums.Size;
import com.tuanmhoang.designpatterns.prototype.simple.products.SupCuaSimple;
import java.util.List;

public class Cook {

    public static void main(String[] args) {
        System.out.println(">>>>> Bat dau nau sup cua...");
        SupCuaSimple noiSupCua = new SupCuaSimple();

        System.out.println("**************************");
        System.out.println(">>>>> Order Sup Cua thuong size MEDIUM...");
        SupCuaSimple supCuaThuongSizeMedium = noiSupCua.clone();
        supCuaThuongSizeMedium.setSize(Size.MEDIUM);
        supCuaThuongSizeMedium.printAllInfo();

        System.out.println("**************************");
        System.out.println(">>>>> Order Sup Cua Dac Biet size BIG...");
        SupCuaSimple supCuaOcHeoSizeBig = noiSupCua.clone();
        supCuaOcHeoSizeBig.setOptionalIngredients(List.of(OptionalIngredients.OC_HEO, OptionalIngredients.TRUNG_BACH_THAO));
        supCuaOcHeoSizeBig.setSize(Size.BIG);
        supCuaOcHeoSizeBig.printAllInfo();
    }
}
