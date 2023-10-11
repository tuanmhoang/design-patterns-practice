# Factory method

## 1. Factory method

![image](https://github.com/tuanmhoang/design-patterns-practice/assets/37680968/9dcf852f-0a80-4236-aa0c-356c24f4a338)

Start with interface `NuocGiaiKhat`

```java
public interface NuocGiaiKhat {
    void makeDrink();
}
```

Then we have implementation for that

```java
public class TraChanh implements NuocGiaiKhat {
    public void makeDrink() {
        // check the code details ...
    }
}
```

```java
public class TraDa implements NuocGiaiKhat{
    public void makeDrink() {
        // check the code details ...
    }
}
```

Then, we have `NuocGiaiKhatFactory`

```java
public class NuocGiaiKhatFactory {
    public NuocGiaiKhat getNuocGiaiKhat(Menu menu){
        switch (menu){
            case TRA_DA:
                return new TraDa();
            case TRA_CHANH:
                return new TraChanh();
            default:
                throw new IllegalArgumentException("Unknown drink!!! Uong vo dau bung do!");
        }
    }
}
```

and the `Client` uses that

```java
public class Client {
    public static void main(String[] args) {
        NuocGiaiKhatFactory factory = new NuocGiaiKhatFactory();

        NuocGiaiKhat traChanh = factory.getNuocGiaiKhat(Menu.TRA_CHANH);
        traChanh.makeDrink();

        NuocGiaiKhat traDa = factory.getNuocGiaiKhat(Menu.TRA_DA);
        traDa.makeDrink();
    }
}
```

## 2. Enhancement

To make enhancement to avoid Open Closed Principle violation

![image](https://github.com/tuanmhoang/design-patterns-practice/assets/37680968/9d8c4160-f38e-4d28-8c0f-f3dc3283970e)

Instead of using class `NuocGiaiKhatFactory`, we create interface `DrinkMaker`

Then we can use in `Client`

```java
public class Client {
    public static void main(String[] args) {
        DrinkMaker traDaMaker = new TraDaMaker();
        NuocGiaiKhat traDa = traDaMaker.getNuocGiaiKhat();
        traDa.makeDrink();

        DrinkMaker traChanhMaker = new TraChanhMaker();
        NuocGiaiKhat traChanh = traChanhMaker.getNuocGiaiKhat();
        traChanh.makeDrink();
    }
}
```
 