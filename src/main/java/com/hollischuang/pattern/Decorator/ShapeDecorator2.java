package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: ShapeDecorator
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:45
 */
public abstract class ShapeDecorator2 implements Shape2 {
    protected Shape2 decoratedShape;

    public ShapeDecorator2(Shape2 decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(Integer id){
        decoratedShape.draw(id);
    }
}