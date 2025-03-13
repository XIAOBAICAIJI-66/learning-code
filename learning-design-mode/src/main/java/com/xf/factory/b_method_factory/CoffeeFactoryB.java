package com.xf.factory.b_method_factory;

/**
 * 咖啡B的工厂类
 */
public class CoffeeFactoryB implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CoffeeB();
    }
}
