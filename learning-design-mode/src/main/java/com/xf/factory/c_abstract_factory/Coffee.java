package com.xf.factory.c_abstract_factory;

/**
 * 咖啡类
 * 由于后续操作都不要直接操作该类,因此该类作为基类,用抽象类作为基类
 */
public abstract class Coffee {

    // 展示当前是什么咖啡
    public abstract void show();
}
