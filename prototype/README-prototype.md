# Prototype

## 1. Simple case

![image](https://github.com/tuanmhoang/design-patterns-practice/assets/37680968/817f5fc3-659a-4cf0-bfef-0c394741cddd)

We have `SupCua` which support method `clone()`

```java
public class SupCuaSimple implements Cloneable {
    private List<MustHaveIngredients> mustHaveIngredients;

    private List<OptionalIngredients> optionalIngredients;

    private Size size;

    public SupCuaSimple() {
        this.mustHaveIngredients = List.of(MustHaveIngredients.values());
        this.optionalIngredients = new ArrayList<>();
        this.size = Size.POT; // let's take this as default;
        cookSupCua();
    }

    private void cookSupCua() {
        // cook SupCua Pot.
        // real case example: can load DB, call 3rd party service, etc.
    }

    // getters, setters

    @Override
    public SupCuaSimple clone() {
        System.out.println("Muc Sup Cua ra...");
        try {
            return (SupCuaSimple)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void printAllInfo() {
        // print info of the Soup
    }
}
```

And the client just need to call `clone()`

```java
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
```

## 2. More complex case

![image](https://github.com/tuanmhoang/design-patterns-practice/assets/37680968/8ba105d6-4bec-4d03-baa9-58c6db0ef733)

Says, I have 3 pots of soup:
- Normal
- OcHeo
- BachThao

```java
public class SupCuaBachThao extends SupCua {
    public SupCuaBachThao(SupCua target) {
        super(target);
        this.getOptionalIngredients().add(OptionalIngredients.TRUNG_BACH_THAO);
    }
}
```

```java
public class SupCuaOcHeo extends SupCua {
    public SupCuaOcHeo(SupCua target) {
        super(target);
        this.getOptionalIngredients().add(OptionalIngredients.OC_HEO);
    }
}
```

And I have a menu, which serves as a cache

```java
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
```
