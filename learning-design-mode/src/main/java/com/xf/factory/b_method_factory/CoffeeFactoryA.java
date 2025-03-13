package com.xf.factory.b_method_factory;

/**
 * 咖啡A的工厂类
 */
public class CoffeeFactoryA implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new CoffeeA();
    }
}
