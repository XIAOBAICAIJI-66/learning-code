package com.xf.singleton;

/**
 * 饿汉式单例
 * 在类加载时直接初始化,静态变量直接赋值
 * @author xf
 */
public class HungryOne {
    // 私有构造方法,防止外部调用new来创建实例
    private HungryOne() {
    }

    // 静态变量直接赋值
    private static HungryOne instance = new HungryOne();

    // 提供对外的方法获取实例
    public static HungryOne getInstance() {
        return instance;
    }
}
