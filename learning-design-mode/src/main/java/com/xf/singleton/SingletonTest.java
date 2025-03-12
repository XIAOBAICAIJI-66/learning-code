package com.xf.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // HungryOne hungryOne = new HungryOne();//无法直接用这种方式创建对象
        /*
          根据静态方法获取多个实例判断是不是同一个实例
          优点:类初始化的时候就创建了实例,并且只创建一个实例,无线程问题
          缺点:类加载时即创建实例,如果实例过大,会占用内存,并且无法解决序列化与反射导致单例被破坏
         */
        HungryOne hungryOne = HungryOne.getInstance();
        HungryOne hungryOne1 = HungryOne.getInstance();
        System.out.println(hungryOne == hungryOne1);

        /*
          根据静态方法获取多个实例判断是不是同一个实例
          优点:类加载时即创建实例,并且只创建一个实例,无线程问题
          缺点:类加载时即创建实例,如果实例过大,会占用内存,并且无法解决序列化与反射导致单例被破坏
         */
        HungryTwo hungryTwo = HungryTwo.getInstance();
        HungryTwo hungryTwo1 = HungryTwo.getInstance();
        System.out.println(hungryTwo == hungryTwo1);

        // LazyOne lazyOne = new LazyOne();// 无法直接用这种方式创建对象
        /*
          根据静态方法获取多个实例判断是不是同一个实例,非线程安全
          优点:类加载的时候不会创建实例,只有使用的时候会创建实例,不会浪费内存
          缺点:会出现线程安全问题,多线程会破坏单例,无法解决序列化与反射导致单例被破坏
         */
        LazyOne lazyOne = LazyOne.getInstance();
        LazyOne lazyOne1 = LazyOne.getInstance();
        System.out.println(lazyOne == lazyOne1);

        /*
          根据静态方法获取多个实例判断是不是同一个实例,线程安全,但是影响使用的效率
          优点:类加载的时候不会创建实例,只有使用的时候会创建实例,不会浪费内存,线程安全
          缺点:每次使用都会有锁效率降低,无法解决序列化与反射导致单例被破坏
         */
        LazyTwo lazyTwo = LazyTwo.getInstance();
        LazyTwo lazyTwo1 = LazyTwo.getInstance();
        System.out.println(lazyTwo == lazyTwo1);

        /*
          根据静态方法获取多个实例判断是不是同一个实例,线程安全,双重检查锁,提升使用效率
          优点:使用的时候才会创建实例不会浪费内存,双重检查锁保证线程安全的同时提升使用的效率
          缺点:无法解决序列化与反射导致单例被破坏
         */
        LazyThree lazyThree = LazyThree.getInstance();
        LazyThree lazyThree1 = LazyThree.getInstance();
        System.out.println(lazyThree == lazyThree1);


        /*
          静态内部类单例模式中实例由内部类创建，由于 JVM 在加载外部类的过程中,
          是不会加载静态内部类的,只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
          优点:是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费
          缺点:不能解决序列化与反射导致单例被破坏
         */
        LazyFour lazyFour = LazyFour.getInstance();
        LazyFour lazyFour1 = LazyFour.getInstance();
        System.out.println(lazyFour == lazyFour1);

        /*
          枚举单例模式中实例由枚举类创建，线程安全,并且是唯一一个不会被反射和序列化破坏单例
         */
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum == singletonEnum1);
    }
}
