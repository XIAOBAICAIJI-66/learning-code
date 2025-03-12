package com.xf.singleton;

/**
 * 饿汉式单例
 * 在类加载时直接初始化,静态变量直接赋值
 * 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
 * instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存的浪费
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
