package com.hollischuang.pattern.Adapter;

/**
 * @author ckia
 * @title: Voltage220
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午5:13
 */
public class Voltage220 {
    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V");
        return src;
    }
}