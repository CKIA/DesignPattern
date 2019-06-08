package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: RedShapeDecorator
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:46
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
//        decoratedShape.draw();
        System.out.println("Border Color: Red");
    }
}