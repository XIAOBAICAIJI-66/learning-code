package com.xf.factory.b_method_factory;

/**
 * 咖啡店
 */
public class CoffeeStore {
    // 咖啡工厂对象
    private CoffeeFactory coffeeFactory;

    // 注入咖啡工厂
    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.show();
    }
}
