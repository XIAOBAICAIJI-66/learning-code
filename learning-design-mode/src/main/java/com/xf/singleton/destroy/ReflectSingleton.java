package com.xf.singleton.destroy;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * 反射破坏单例模式
 * 对应的解决方法
 */
public class ReflectSingleton {

    public static void main(String[] args) throws Exception {
        // 反射破坏单例模式
        reflectDestroy();
        // 解决单例被破坏
        reflect();
    }

    private static void reflectDestroy() throws Exception {
        // 获取Singleton类的字节码对象
        Class<SingletonReflect> clazz = SingletonReflect.class;
        // 获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        // 取消访问检查
        constructor.setAccessible(true);
        // 创建Singleton类的对象s1
        SingletonReflect s1 = (SingletonReflect) constructor.newInstance();
        // 创建Singleton类的对象s2
        SingletonReflect s2 = (SingletonReflect) constructor.newInstance();
        // 判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);
    }

    private static void reflect() throws Exception {
        // 获取Singleton类的字节码对象
        Class<SingletonReflect1> clazz = SingletonReflect1.class;
        // 获取Singleton类的私有无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        // 取消访问检查
        constructor.setAccessible(true);
        // 创建Singleton类的对象s1
        SingletonReflect1 s1 = (SingletonReflect1) constructor.newInstance();
        System.out.println("s1:"+s1);
        // 创建Singleton类的对象s2
        SingletonReflect1 s2 = (SingletonReflect1) constructor.newInstance();
        System.out.println("s2:"+s2);
        // 判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);
    }

}


/**
 * 静态内部类实现单例
 */
class SingletonReflect implements Serializable {

    // 私有构造方法
    private SingletonReflect() {
    }

    private static class SingletonHolder {
        private static final SingletonReflect INSTANCE = new SingletonReflect();
    }

    // 对外提供静态方法获取该对象
    public static SingletonReflect getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/**
 * 预防反射导致单例被破坏
 */
class SingletonReflect1 implements Serializable {

    private static volatile boolean isInstanceCreated = false;

    // 私有构造方法
    private SingletonReflect1() {
        if (isInstanceCreated) {
            throw new RuntimeException("单例已被破坏");
        }
        isInstanceCreated = true;
    }

    private static class SingletonHolder {
        private static final SingletonReflect1 INSTANCE = new SingletonReflect1();
    }

    // 对外提供静态方法获取该对象
    public static SingletonReflect1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}