package com.xf.factory.c_abstract_factory;

public class Test {
    public static void main(String[] args) {
        /*
         *优点：
         * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
         * 缺点：
         * 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
         */
        // 创建A类型的产品
        TypeFactory typeFactory = new TypeFactoryA();
        Coffee coffee = typeFactory.createCoffee();
        coffee.show();
        Dessert dessert = typeFactory.createDessert();
        dessert.show();
        // 创建B类型的产品
        TypeFactory typeFactory1 = new TypeFactoryB();
        Coffee coffee1 = typeFactory1.createCoffee();
        coffee1.show();
        Dessert dessert1 = typeFactory1.createDessert();
        dessert1.show();
    }
}
