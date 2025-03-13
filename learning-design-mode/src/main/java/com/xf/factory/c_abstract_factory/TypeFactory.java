package com.xf.factory.c_abstract_factory;

/**
 * 工厂接口
 * 这里面定义生成不同类型的产品的方法
 */
public interface TypeFactory {

    //生产咖啡
    Coffee createCoffee();
    //生产甜点
    Dessert createDessert();
}
