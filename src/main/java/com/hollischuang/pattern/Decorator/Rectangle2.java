package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: Rectangle
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:45
 */
public class Rectangle2 implements Shape2 {

    @Override
    public void draw(Integer id) {
        System.out.println("Shape: Rectangle2 id = "+id);
    }
}
