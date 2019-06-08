package com.hollischuang.pattern.Singlenton.client;

import com.hollischuang.pattern.Singlenton.hangry.Singleton;
import com.hollischuang.pattern.Singlenton.lazy.StaticInnerClassSingleton;

/**
 * Created by hollis on 16/4/6.
 */
public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
        System.out.println(instance==instance2);
    }
}
