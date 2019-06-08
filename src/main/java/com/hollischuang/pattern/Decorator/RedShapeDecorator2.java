package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: RedShapeDecorator
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:46
 */
public class RedShapeDecorator2 extends ShapeDecorator2 {

    public RedShapeDecorator2(Shape2 decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(Integer id) {
        setRedBorder(decoratedShape);
        ++id;
        decoratedShape.draw(id);
    }

    private void setRedBorder(Shape2 decoratedShape){
//        decoratedShape.draw();
        System.out.println("Border Color: blank");
    }

}