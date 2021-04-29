package com.singleton;

/**
 *   双检锁/双重校验锁（DCL，即 double-checked locking）
 *   JDK 版本：JDK1.5 起
 *   是否 Lazy 初始化：是
 *   是否多线程安全：是
 *   描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 *   getInstance() 的性能对应用程序很
 */
public class DoubleCheckLocking {
    String name;
    private static volatile DoubleCheckLocking instance;

    public DoubleCheckLocking() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static DoubleCheckLocking getInstance() {
        if (instance==null){
            synchronized (DoubleCheckLocking.class){
                instance = new DoubleCheckLocking();
            }
        }
        return instance;
    }
}
