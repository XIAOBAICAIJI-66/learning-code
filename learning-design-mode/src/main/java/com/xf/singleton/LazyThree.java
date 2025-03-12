package com.xf.singleton;

/**
 * 懒汉式单例
 * 使用的时候才会创建实例,并且是单例
 * 双重检查锁,优化加锁的,如果直接加锁会影响每次使用的效率
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题。
 * 双重检测锁模式看上去完美无缺，其实是存在问题，在多线程的情况下，可能会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 `volatile` 关键字, `volatile` 关键字可以保证可见性和有序性。
 * 添加 `volatile` 关键字之后的双重检查锁模式是一种比较好的单例实现模式，能够保证在多线程的情况下线程安全也不会有性能问题。
 */
public class LazyThree {
    // 私有构造方法
    private LazyThree() {
    }
    // 静态变量
    private static volatile LazyThree lazy;

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
