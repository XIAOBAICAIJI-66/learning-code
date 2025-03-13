package com.xf.factory.c_abstract_factory;

/**
 * 甜点类
 * 由于后续操作都不要直接操作该类,因此该类作为基类,用抽象类作为基类
 */
public abstract class Dessert {

    // 展示当前是什么甜点
    public abstract void show();
}
