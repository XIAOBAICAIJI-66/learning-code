package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
 * 双重检查锁,优化加锁的,如果直接加锁会影响每次使用的效率
 */
public class LazyThree {
    // 私有构造方法
    private LazyThree() {
    }
    // 静态变量
    private static LazyThree lazy;

    // 获取实例
    //这个方法需要注意线程安全问题
    public static LazyThree getInstance() {
        // 如果实例为空则创建,否则直接返回已有的实例
        if (lazy == null) {
            //不存在时加锁进行初始化
            synchronized (LazyThree.class) {
                if (lazy == null) {
                    lazy = new LazyThree();
                }
            }
        }
        return lazy;
    }
}
