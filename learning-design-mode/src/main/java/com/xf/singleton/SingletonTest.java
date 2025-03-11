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


        // 通过静态内部类的方式创建单例
        // 静态内部类单例模式是一种优秀的单例模式，
        // 是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费
        LazyFour lazyFour = LazyFour.getInstance();
        LazyFour lazyFour1 = LazyFour.getInstance();
        System.out.println(lazyFour == lazyFour1);
    }
}
