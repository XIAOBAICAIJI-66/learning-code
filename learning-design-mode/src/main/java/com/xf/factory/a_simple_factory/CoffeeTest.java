package com.xf.factory.a_simple_factory;

/**
 * 测试类
 */
public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        // 如果没有工厂类的话,我们就需要在当前的咖啡店类里面判断需要什么咖啡
        coffeeStore.orderCoffeeOne("A");
        coffeeStore.orderCoffeeOne("B");

        //如果有工厂类CoffeeFactory,我们就不需要在CoffeeStore类里面判断了,只需要将对应参数移到工厂类里面去做业务判断,而CoffeeStore类只需单纯的调用咖啡show方法即可
        coffeeStore.orderCoffeeTwo("A");
        coffeeStore.orderCoffeeTwo("B");
        coffeeStore.orderCoffeeTwo("C");

        //静态工厂
        coffeeStore.orderCoffeeThree("A");
        coffeeStore.orderCoffeeThree("B");
        coffeeStore.orderCoffeeThree("C");
    }
}
