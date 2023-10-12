package com.tuanmhoang.designpatterns.prototype.complex;

import com.tuanmhoang.designpatterns.prototype.complex.products.SupCua;
import com.tuanmhoang.designpatterns.prototype.complex.types.SupCuaType;

public class Cook {
    public static void main(String[] args) {
        SupCuaMenu menu = new SupCuaMenu();
        menu.loadMenu();

        System.out.println(">>>>> Order SUP_CUA_THUONG_SIZE_SMALL ");
        SupCua supCuaThuongSizeSmall = menu.getSupCua(SupCuaType.SUP_CUA_THUONG_SIZE_SMALL);
        supCuaThuongSizeSmall.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_THUONG_SIZE_MEDIUM ");
        SupCua supCuaThuongSizeMedium = menu.getSupCua(SupCuaType.SUP_CUA_THUONG_SIZE_MEDIUM);
        supCuaThuongSizeMedium.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_THUONG_SIZE_BIG ");
        SupCua supCuaThuongSizeBig = menu.getSupCua(SupCuaType.SUP_CUA_THUONG_SIZE_BIG);
        supCuaThuongSizeBig.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_OC_HEO_SIZE_SMALL ");
        SupCua supCuaOcHeoSizeSmall = menu.getSupCua(SupCuaType.SUP_CUA_OC_HEO_SIZE_SMALL);
        supCuaOcHeoSizeSmall.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_OC_HEO_SIZE_MEDIUM ");
        SupCua supCuaOcHeoSizeMedium = menu.getSupCua(SupCuaType.SUP_CUA_OC_HEO_SIZE_MEDIUM);
        supCuaOcHeoSizeMedium.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_OC_HEO_SIZE_BIG ");
        SupCua supCuaOcHeoSizeBig = menu.getSupCua(SupCuaType.SUP_CUA_OC_HEO_SIZE_BIG);
        supCuaOcHeoSizeBig.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_BACH_THAO_SIZE_SMALL ");
        SupCua supCuaBachThaoSizeSmall = menu.getSupCua(SupCuaType.SUP_CUA_BACH_THAO_SIZE_SMALL);
        supCuaBachThaoSizeSmall.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_BACH_THAO_SIZE_MEDIUM ");
        SupCua supCuaBachThaoSizeMedium = menu.getSupCua(SupCuaType.SUP_CUA_BACH_THAO_SIZE_MEDIUM);
        supCuaBachThaoSizeMedium.printAllInfo();

        System.out.println(">>>>> Order SUP_CUA_BACH_THAO_SIZE_BIG ");
        SupCua supCuaBachThaoSizeBig = menu.getSupCua(SupCuaType.SUP_CUA_BACH_THAO_SIZE_BIG);
        supCuaBachThaoSizeBig.printAllInfo();
    }
}
