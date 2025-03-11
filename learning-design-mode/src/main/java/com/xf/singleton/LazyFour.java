package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用静态内部类的方式来实现
 * 静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的,
 * 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 * 静态属性由于被 `static` 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 */
public class LazyFour {
    // 私有构造方法
    private LazyFour() {
    }

    // 静态内部类
    //第一次加载LazyFour类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加载LazyHolder
    // 并初始化INSTANCE，这样不仅能确保线程安全，也能保证 LazyFour 类的唯一性
    private static class LazyHolder {
        private static LazyFour INSTANCE = new LazyFour();
    }

    // 获取实例
    public static LazyFour getInstance() {
        // 直接根据静态内部类获取实例
        return LazyHolder.INSTANCE;
    }
}
