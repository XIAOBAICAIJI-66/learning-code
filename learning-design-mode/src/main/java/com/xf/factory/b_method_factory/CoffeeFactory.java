package com.xf.factory.b_method_factory;

/**
 * 咖啡的工厂类
 * 判断需要什么咖啡类型即可,后续有修改的只需要修改这里的代码即可,不会影响业务的代码
 * <p>
 * 增加新产品时还是需要修改工厂类的代码，还是没有解决“开闭原则”。
 */
public interface CoffeeFactory {
    public Coffee createCoffee();

}
