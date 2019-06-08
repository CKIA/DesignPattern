package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: Circle
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:45
 */
public class Circle2 implements Shape2 {

    @Override
    public void draw(Integer id) {
        System.out.println("Shape: Circle id ="+id);
    }
}