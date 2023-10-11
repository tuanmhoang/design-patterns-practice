# Abstract Factory

![image](https://github.com/tuanmhoang/design-patterns-practice/assets/37680968/f0c7e528-415e-40c6-a3db-49c659cc152c)

We have family of products:
- Noodles
- Meat
- Vegetables

We use `NoodlesMaker` to create the product that we want to.

```java
public abstract class NoodlesMaker {
    abstract Noodles getNoodles();

    abstract Meat getMeat();

    abstract Vegetables getVegetables();

    public void createNoodles(){
        System.out.println("> Taking noodles...");
        Noodles noodles = getNoodles();
        System.out.println(noodles.getNoodles().name());

        System.out.println("> Taking meat...");
        Meat meat = getMeat();
        System.out.println(meat.getMeat().name());

        System.out.println("> Taking vegetables...");
        Vegetables vegetables = getVegetables();
        vegetables.getVegetables()
            .stream()
            .map(vegetablesType -> vegetablesType.name())
            .forEach(v -> System.out.println(v));
    }
}
```

For each types of noodles, we can create the object with families of related objects.

```java
public class BunBoMaker extends NoodlesMaker{
    @Override
    Noodles getNoodles() {
        return new BunBo();
    }

    @Override
    Meat getMeat() {
        return new Beef();
    }

    @Override
    Vegetables getVegetables() {
        return new BunBoVegetables();
    }
}
```

```java
public abstract class PhoMaker extends NoodlesMaker{
    @Override
    Noodles getNoodles() {
        return new Pho();
    }

    abstract Meat getMeat();

    @Override
    Vegetables getVegetables() {
        return new PhoVegetables();
    }
}
```

```java
public class PhoBoMaker extends PhoMaker{
    @Override
    Meat getMeat() {
        return new Beef();
    }
}
```

```java
public class PhoGaMaker extends PhoMaker{
    @Override
    Meat getMeat() {
        return new Chicken();
    }
}
```