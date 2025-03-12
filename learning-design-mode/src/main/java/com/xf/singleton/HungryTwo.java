package com.xf.singleton;

/**
 * 饿汉式单例
 * 在类加载时直接初始化,静态代码块赋值
 * 该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。
 * 所以和饿汉式的静态变量方式基本上一样，当然该方式也存在内存浪费问题。
 */
public class HungryTwo {
    // 私有构造方法,防止外部调用new来创建实例
    private HungryTwo() {
    }

    // 静态变量
    private static HungryTwo instance;

    // 静态代码块,在类加载时直接初始化,赋值
    static {
        instance = new HungryTwo();
    }

    // 提供对外的方法获取实例
    public static HungryTwo getInstance() {
        return instance;
    }
}
