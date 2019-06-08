package com.hollischuang.pattern.Proxy;

/**
 * @author ckia
 * @title: ProxyDemo
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:38
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
