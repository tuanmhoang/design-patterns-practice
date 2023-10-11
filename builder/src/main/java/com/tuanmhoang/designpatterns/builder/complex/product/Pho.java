package com.tuanmhoang.designpatterns.builder.complex.product;

import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.List;
import java.util.stream.Collectors;

public class Pho implements Noodles{

    private static final String SEPARATOR = ", ";
    private NoodlesType noodles;

    private List<Meat> meat;

    private List<Vegetables> vegetables;

    private List<Flavor> flavors;

    public Pho(NoodlesType noodlesType, List<Meat> meat, List<Vegetables> vegetables, List<Flavor> flavors) {
        this.noodles = noodlesType;
        this.meat = meat;
        this.vegetables = vegetables;
        this.flavors = flavors;
    }

    @Override
    public void printIngredients() {
        String ingredients =
            """
                ****** Pho ******
                > Noodles: %s
                > Meat: %s
                > Vegetables: %s
                > Flavor: %s
                """.formatted(
                this.noodles.name(),
                this.meat.stream()
                    .map(Meat::name)
                    .collect(Collectors.joining(SEPARATOR)),
                this.vegetables.stream()
                    .map(Vegetables::name)
                    .collect(Collectors.joining(SEPARATOR)),
                this.flavors.stream()
                    .map(Flavor::name)
                    .collect(Collectors.joining(SEPARATOR))
            );
        System.out.println(ingredients);
    }
}
