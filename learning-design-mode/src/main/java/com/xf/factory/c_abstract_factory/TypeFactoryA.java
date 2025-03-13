package com.xf.factory.c_abstract_factory;

/**
 * 类型A的工厂类
 */
public class TypeFactoryA implements TypeFactory {
    @Override
    public Coffee createCoffee() {
        return new CoffeeA();
    }

    @Override
    public Dessert createDessert() {
        return new DessertA();
    }
}
