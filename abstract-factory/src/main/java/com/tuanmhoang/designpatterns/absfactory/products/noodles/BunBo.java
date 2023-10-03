package com.tuanmhoang.designpatterns.absfactory.products.noodles;

import com.tuanmhoang.designpatterns.absfactory.enums.NoodlesType;

public class BunBo implements Noodles{
    @Override
    public NoodlesType getNoodles() {
        return NoodlesType.BUN;
    }
}
