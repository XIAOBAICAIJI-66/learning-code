package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
 */
public class LazyTwo {
    // 私有构造方法
    private LazyTwo() {
    }
    // 静态变量
    private static LazyTwo lazy;

    // 获取实例
    //这个方法需要注意线程安全问题
    public static synchronized LazyTwo getInstance() {
        // 如果实例为空则创建,否则直接返回已有的实例
        if (lazy == null) {
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
