package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
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
