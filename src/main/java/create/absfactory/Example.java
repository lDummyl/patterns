package create.absfactory;


import java.util.Random;

/*
Задание
Следать 3 фабрики мебели, модерн, барокко и классицизм
Клиента который умеет покупать мебель
от завода изготовителя и садится на нее.
 */

public class Example {

    public static void main(String[] args) {

        FactoryInt factory = new Random().nextBoolean() ? new Factory() : new ModernFactory();
        new MyClient(factory);
    }
}


interface Usefull {
    void use();
}


interface FactoryInt {

    // интерфейс возвращает абстрактный продукт
    Usefull provide();

}


class Factory implements FactoryInt {


    public Usefull provide() {
        return new Product();
    }

}

class ModernFactory implements FactoryInt {

    public Usefull provide() {
        return new ModernProduct();
    }

}


class Product implements Usefull {

    public void use() {
        System.out.println("Simple use!");
    }
}

class ModernProduct implements Usefull {

    public void use() {
        System.out.println("Fancy use!");
    }
}

class MyClient {

    // Клиену безразличны реализации он в контректе ждет интерфейс
    public MyClient(FactoryInt product) {
        product.provide().use();
    }

}
