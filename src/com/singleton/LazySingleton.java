package com.singleton;

/**
 *  懒汉式
 *  线程不安全
 *  是否 Lazy 初始化：是
 *  是否多线程安全：否
 *  描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 *  因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 *  这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 */
public class LazySingleton {
    String name;
    private static LazySingleton instance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static LazySingleton getInstance() {
        if (instance!=null){
            return instance;
        }else {
            return new LazySingleton();
        }
    }

    public LazySingleton() {
    }



}
