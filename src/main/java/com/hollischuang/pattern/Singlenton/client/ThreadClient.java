package com.hollischuang.pattern.Singlenton.client;

import com.hollischuang.pattern.Singlenton.hangry.Singleton;
import com.hollischuang.pattern.Singlenton.lazy.StaticInnerClassSingleton;


/**
 * @author ckia
 * @title: ThreadClient
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午3:59
 */
public class ThreadClient {


    public static void deathLock() {
        new Thread() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        }.start();
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            deathLock();
        }
    }
}
