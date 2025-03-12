package com.xf.singleton;

/**
 * 枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，
 * 设计者充分的利用了枚举的这个特性来实现单例模式，枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
 * 即使当前枚举里没有方法，这种实现方式也已经确保了单例模式的正确性，当后续需要添加业务逻辑时，可以直接在枚举中添加方法，而不用担心破坏单例特性。
 */
public enum SingletonEnum {
    // 枚举类型的实例
    INSTANCE;

    //枚举内可以添加对应的方法
    public void doSomething() {
        System.out.println("doSomething");
    }
}
