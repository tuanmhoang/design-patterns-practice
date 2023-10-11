package com.tuanmhoang.designpatterns.builder.simple.products;

import com.tuanmhoang.designpatterns.builder.types.Flavor;
import com.tuanmhoang.designpatterns.builder.types.Meat;
import com.tuanmhoang.designpatterns.builder.types.NoodlesType;
import com.tuanmhoang.designpatterns.builder.types.Vegetables;
import java.util.List;
import java.util.stream.Collectors;

public class BunBoSimple {

    private static final String SEPARATOR = ", ";

    private NoodlesType noodles;

    private List<Meat> meat;

    private List<Vegetables> vegetables;

    private List<Flavor> flavor;

    public BunBoSimple(NoodlesType noodles, List<Meat> meat, List<Vegetables> vegetables, List<Flavor> flavor) {
        this.noodles = noodles;
        this.meat = meat;
        this.vegetables = vegetables;
        this.flavor = flavor;
    }

    public void printIngredients() {
        String ingredients =
            """
                ****** Ingredients ******
                    Noodles: %s
                    Meat: %s
                    Vegetables: %s
                    Flavor: %s
                """.formatted(
                this.noodles.name(),
                this.meat.stream()
                    .map(Meat::name)
                    .collect(Collectors.joining(SEPARATOR)),
                this.vegetables.stream()
                    .map(Vegetables::name)
                    .collect(Collectors.joining(SEPARATOR)),
                this.flavor.stream()
                    .map(Flavor::name)
                    .collect(Collectors.joining(SEPARATOR))
            );
        System.out.println(ingredients);
    }
}
