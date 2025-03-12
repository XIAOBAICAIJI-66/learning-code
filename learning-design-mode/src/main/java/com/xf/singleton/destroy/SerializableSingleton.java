package com.xf.singleton.destroy;

import java.io.*;

/**
 * 序列化破坏单例
 * 对应的解决方法
 */
public class SerializableSingleton {
    public static void main(String[] args) throws Exception {
        // 序列化破坏单例
        serializableDestroy();
        // 解决单例被破坏
        serializable();
    }

    private static void serializableDestroy() throws Exception {
        // 准备工作,先将SingletonDemo类写入到一个文件中
        writeObjectFile();
        // 获取反序列化的对象
        SingletonDemo singletonDemo = readObjectFromFile();
        SingletonDemo singletonDemo1 = readObjectFromFile();
        System.out.println(singletonDemo == singletonDemo1);
    }



    // 将类转为文件,为后续的读取序列化做准备做准备
    public static void writeObjectFile() throws Exception {
        // 将SingletonDemo写入文件
        // 1:获取SingletonDemo对象
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        // 2:创建输出流,将对象写入当前文件所在的文件夹内的singletonDemo.txt文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonDemo.txt"));
        // 3:将singletonDemo对象写入文件
        oos.writeObject(singletonDemo);
    }

    // 根据目标文件获取序列化的类
    private static SingletonDemo readObjectFromFile() throws Exception {
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singletonDemo.txt"));
        // 第一个读取Singleton对象
        SingletonDemo instance = (SingletonDemo) ois.readObject();
        return instance;
    }

    private static void serializable() throws Exception {
        // 准备工作,先将SingletonDemo类写入到一个文件中
        writeObjectFile1();
        // 获取反序列化的对象
        SingletonDemo1 singletonDemo = readObjectFromFile1();
        SingletonDemo1 singletonDemo1 = readObjectFromFile1();
        System.out.println(singletonDemo == singletonDemo1);
    }

    // 将类转为文件,为后续的读取序列化做准备做准备
    public static void writeObjectFile1() throws Exception {
        // 将SingletonDemo写入文件
        // 1:获取SingletonDemo对象
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
        // 2:创建输出流,将对象写入当前文件所在的文件夹内的singletonDemo.txt文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonDemo1.txt"));
        // 3:将singletonDemo对象写入文件
        oos.writeObject(singletonDemo1);
    }

    // 根据目标文件获取序列化的类
    private static SingletonDemo1 readObjectFromFile1() throws Exception {
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singletonDemo1.txt"));
        // 第一个读取Singleton对象
        SingletonDemo1 instance = (SingletonDemo1) ois.readObject();
        return instance;
    }

}

/**
 * 静态内部类实现单例
 */
class SingletonDemo implements Serializable {

    // 私有构造方法
    private SingletonDemo() {
    }

    private static class SingletonHolder {
        private static final SingletonDemo INSTANCE = new SingletonDemo();
    }

    // 对外提供静态方法获取该对象
    public static SingletonDemo getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

/**
 * 预防序列化导致单例被破坏
 */
class SingletonDemo1 implements Serializable {

    // 私有构造方法
    private SingletonDemo1() {
    }

    private static class SingletonHolder {
        private static final SingletonDemo1 INSTANCE = new SingletonDemo1();
    }

    // 对外提供静态方法获取该对象
    public static SingletonDemo1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 防止序列化与反序列化导致单例被破坏只需要重写readResolve方法即可
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}