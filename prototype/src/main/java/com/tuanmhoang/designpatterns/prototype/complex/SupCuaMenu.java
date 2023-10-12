package com.tuanmhoang.designpatterns.prototype.complex;

import com.tuanmhoang.designpatterns.prototype.complex.products.SupCua;
import com.tuanmhoang.designpatterns.prototype.complex.products.SupCuaBachThao;
import com.tuanmhoang.designpatterns.prototype.complex.products.SupCuaOcHeo;
import com.tuanmhoang.designpatterns.prototype.complex.types.SupCuaType;
import java.util.HashMap;
import com.tuanmhoang.designpatterns.prototype.enums.Size;
import java.util.Map;

public class SupCuaMenu {

    private Map<SupCuaType, SupCua> supCuaMenu = new HashMap<>();

    public SupCua getSupCua(SupCuaType supCuaType) {
        SupCua orderedSupCua = supCuaMenu.get(supCuaType);
        return orderedSupCua.clone();
    }

    public void loadMenu() {
        SupCua supCua = new SupCua();
        System.out.println("****** Loading menu ******");

        SupCua supCuaThuongSizeSmall = supCua.clone();
        supCuaThuongSizeSmall.setSize(Size.SMALL);
        supCuaMenu.put(SupCuaType.SUP_CUA_THUONG_SIZE_SMALL, supCuaThuongSizeSmall);

        SupCua supCuaThuongSizeMedium = supCua.clone();
        supCuaThuongSizeMedium.setSize(Size.MEDIUM);
        supCuaMenu.put(SupCuaType.SUP_CUA_THUONG_SIZE_MEDIUM, supCuaThuongSizeMedium);

        SupCua supCuaThuongSizeBig = supCua.clone();
        supCuaThuongSizeBig.setSize(Size.BIG);
        supCuaMenu.put(SupCuaType.SUP_CUA_THUONG_SIZE_BIG, supCuaThuongSizeBig);

        SupCuaOcHeo supCuaOcHeo = new SupCuaOcHeo(supCua);

        SupCua supCuaOcHeoSizeSmall = supCuaOcHeo.clone();
        supCuaOcHeoSizeSmall.setSize(Size.SMALL);
        supCuaMenu.put(SupCuaType.SUP_CUA_OC_HEO_SIZE_SMALL, supCuaOcHeoSizeSmall);

        SupCua supCuaOcHeoSizeMedium = supCuaOcHeo.clone();
        supCuaOcHeoSizeMedium.setSize(Size.MEDIUM);
        supCuaMenu.put(SupCuaType.SUP_CUA_OC_HEO_SIZE_MEDIUM, supCuaOcHeoSizeMedium);

        SupCua supCuaOcHeoSizeBig = supCuaOcHeo.clone();
        supCuaOcHeoSizeBig.setSize(Size.BIG);
        supCuaMenu.put(SupCuaType.SUP_CUA_OC_HEO_SIZE_BIG, supCuaOcHeoSizeBig);

        SupCuaBachThao supCuaBachThao = new SupCuaBachThao(supCua);

        SupCua supCuaBachThaoSizeSmall = supCuaBachThao.clone();
        supCuaBachThaoSizeSmall.setSize(Size.SMALL);
        supCuaMenu.put(SupCuaType.SUP_CUA_BACH_THAO_SIZE_SMALL, supCuaBachThaoSizeSmall);

        SupCua supCuaBachThaoSizeMedium = supCuaBachThao.clone();
        supCuaBachThaoSizeMedium.setSize(Size.MEDIUM);
        supCuaMenu.put(SupCuaType.SUP_CUA_BACH_THAO_SIZE_MEDIUM, supCuaBachThaoSizeMedium);

        SupCua supCuaBachThaoSizeBig = supCuaBachThao.clone();
        supCuaBachThaoSizeBig.setSize(Size.BIG);
        supCuaMenu.put(SupCuaType.SUP_CUA_BACH_THAO_SIZE_BIG, supCuaBachThaoSizeBig);
        System.out.println("****** Done loading menu ******");
    }
}