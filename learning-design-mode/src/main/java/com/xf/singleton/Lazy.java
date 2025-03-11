package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
 */
public class Lazy {
    // 私有构造方法
    private Lazy() {
    }
    // 静态变量
    private static Lazy lazy;

    // 获取实例
    //这个方法需要注意线程安全问题
    public static synchronized Lazy getInstance() {
        // 如果实例为空则创建,否则直接返回已有的实例
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
