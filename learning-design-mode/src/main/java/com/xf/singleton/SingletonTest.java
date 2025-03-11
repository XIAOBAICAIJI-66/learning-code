package com.xf.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // HungryOne hungryOne = new HungryOne();//无法直接用这种方式创建对象
        // 根据静态方法获取多个实例判断是不是同一个实例
        HungryOne hungryOne = HungryOne.getInstance();
        HungryOne hungryOne1 = HungryOne.getInstance();
        System.out.println(hungryOne == hungryOne1);

        // HungryTwo hungryTwo = new HungryTwo();//无法直接用这种方式创建对象
        // 根据静态方法获取多个实例判断是不是同一个实例
        HungryTwo hungryTwo = HungryTwo.getInstance();
        HungryTwo hungryTwo1 = HungryTwo.getInstance();
        System.out.println(hungryTwo == hungryTwo1);

        // LazyOne lazyOne = new LazyOne();// 无法直接用这种方式创建对象
        // 根据静态方法获取多个实例判断是不是同一个实例,非线程安全
        LazyOne lazyOne = LazyOne.getInstance();
        LazyOne lazyOne1 = LazyOne.getInstance();
        System.out.println(lazyOne == lazyOne1);

        // 根据静态方法获取多个实例判断是不是同一个实例,线程安全,但是影响使用的效率
        LazyTwo lazyTwo = LazyTwo.getInstance();
        LazyTwo lazyTwo1 = LazyTwo.getInstance();
        System.out.println(lazyTwo == lazyTwo1);

        // 根据静态方法获取多个实例判断是不是同一个实例,线程安全,双重检查锁,提升使用效率
        LazyThree lazyThree = LazyThree.getInstance();
        LazyThree lazyThree1 = LazyThree.getInstance();
        System.out.println(lazyThree == lazyThree1);
    }
}
