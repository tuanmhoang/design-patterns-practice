package com.tuanmhoang.designpatterns.prototype.complex.products;

import com.tuanmhoang.designpatterns.prototype.enums.MustHaveIngredients;
import com.tuanmhoang.designpatterns.prototype.enums.OptionalIngredients;
import com.tuanmhoang.designpatterns.prototype.enums.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SupCua implements Cloneable {
    private List<MustHaveIngredients> mustHaveIngredients;

    private List<OptionalIngredients> optionalIngredients;

    private Size size;

    public SupCua() {
        this.mustHaveIngredients = List.of(MustHaveIngredients.values());
        this.optionalIngredients = new ArrayList<>();
        this.size = Size.SMALL; // let's take this as default;
        cookSupCua();
    }

    public SupCua(SupCua target) {
        this.mustHaveIngredients = target.getMustHaveIngredients();
        this.optionalIngredients = new ArrayList<>();
        this.size = target.getSize();
    }

    private void cookSupCua() {
        System.out.println("Start to cook Sup Cua...");
        mustHaveIngredients.stream()
            .forEach(mustHaveIngredient -> {
                System.out.println("Preparing... " + mustHaveIngredient.name());
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        System.out.println("Cook...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finish cooking soup! :)");
    }

    public void printAllInfo() {
        System.out.println("* Must have ingredients *");
        List<String> mhIngredients = this.getMustHaveIngredients().stream()
            .map(i -> i.name())
            .collect(Collectors.toList());
        System.out.println(String.join(", ", mhIngredients));
        System.out.println("* Optional ingredients *");
        List<String> optIngredients = optionalIngredients.stream()
            .map(i -> i.name())
            .collect(Collectors.toList());
        String optionalIngredientsAsString = null;
        if (optIngredients.isEmpty()) {
            optionalIngredientsAsString = "Normal Soup. No additional ingredients";
        } else {
            optionalIngredientsAsString = String.join(", ", optIngredients);
        }
        System.out.println(optionalIngredientsAsString);
        System.out.println("* Size *");
        System.out.println(this.size.name());
    }

    @Override
    public SupCua clone() {
        try {
            return (SupCua)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<MustHaveIngredients> getMustHaveIngredients() {
        return mustHaveIngredients;
    }

    public List<OptionalIngredients> getOptionalIngredients() {
        return optionalIngredients;
    }

    public void setOptionalIngredients(List<OptionalIngredients> optionalIngredients) {
        this.optionalIngredients = optionalIngredients;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
