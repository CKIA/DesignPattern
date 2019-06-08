package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: Circle
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:45
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}