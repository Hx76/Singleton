package test;

import com.singleton.HungrySingleton;

public class SingletonTest {
    public static void main(String[] args) {
        // 饿汉式
        HungrySingleton.getInstance().setName("张三");
        System.out.println(HungrySingleton.getInstance().getName());
    }
}
