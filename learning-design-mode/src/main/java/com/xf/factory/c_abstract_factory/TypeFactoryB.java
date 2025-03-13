package com.xf.factory.c_abstract_factory;

/**
 * 类型B的工厂类
 */
public class TypeFactoryB implements TypeFactory {
    @Override
    public Coffee createCoffee() {
        return new CoffeeB();
    }

    @Override
    public Dessert createDessert() {
        return new DessertB();
    }
}
