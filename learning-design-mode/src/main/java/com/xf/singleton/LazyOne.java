package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
 * 当调用getInstance()方法获取Singleton类的对象的时候才创建Singleton类的对象，这样就实现了懒加载的效果。但是，如果是多线程环境，会出现线程安全问题
 */
public class LazyOne {
    // 私有构造方法
    private LazyOne() {
    }
    // 静态变量
    private static LazyOne lazy;

    // 获取实例
    public static LazyOne getInstance() {
        // 如果实例为空则创建,否则直接返回已有的实例
        if (lazy == null) {
            lazy = new LazyOne();
        }
        return lazy;
    }
}
