package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: ShapeDecorator
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:45
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}