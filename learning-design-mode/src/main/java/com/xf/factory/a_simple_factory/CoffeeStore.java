package com.xf.factory.a_simple_factory;

/**
 * 咖啡店
 */
public class CoffeeStore {

    // 未使用简单工厂模式的时候,我们需要在这里根据类型去判断什么咖啡,因此若后续有扩展的话这里要改
    public void orderCoffeeOne(String type) {
        Coffee coffee = null;
        if ("A".equals(type)) {
            coffee = new CoffeeA();
        } else if ("B".equals(type)) {
            coffee = new CoffeeB();
        }
        coffee.show();
    }


    /**
     * 使用简单工厂模式的时候,只需要传入类型,后续扩展只需在工厂类中添加修改逻辑不会影响这里的代码
     * 将咖啡店和咖啡类型解耦,但是此时会增加咖啡工厂与咖啡类型的耦合
     * 优点：封装了创建对象的过程，可以通过参数直接获取对象。把对象的创建和业务逻辑层分开，这样以后就避免了修改客户代码，如果要实现新产品直接修改工厂类，而不需要在原代码中修改，这样就降低了客户代码修改的可能性，更加容易扩展。
     * 缺点：增加新产品时还是需要修改工厂类的代码，违背了“开闭原则”。
     */
    public void orderCoffeeTwo(String type) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(type);
        if (coffee != null) {
            coffee.show();
        }
    }

    /**
     * 扩展简单方法,优化成静态工厂模式,减少创建工厂类
     */
    public void orderCoffeeThree(String type) {
        Coffee coffee = CoffeeFactory.createCoffeeStatic(type);
        if (coffee != null) {
            coffee.show();
        }
    }
}
