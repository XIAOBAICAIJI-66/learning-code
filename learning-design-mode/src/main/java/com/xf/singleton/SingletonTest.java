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

        // Lazy lazy2 = new Lazy();// 无法直接用这种方式创建对象
        // 根据静态方法获取多个实例判断是不是同一个实例
        Lazy lazy = Lazy.getInstance();
        Lazy lazy1 = Lazy.getInstance();
        System.out.println(lazy == lazy1);
    }
}
