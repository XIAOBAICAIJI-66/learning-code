package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
 * 该方式也实现了懒加载效果，同时又解决了线程安全问题。但是在getInstance()方法上添加了synchronized关键字，导致该方法的执行效果特别低。
 * 从下面代码我们可以看出，其实就是在初始化instance的时候才会出现线程安全问题，一旦初始化完成就不存在了
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
