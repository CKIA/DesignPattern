package com.hollischuang.pattern.Decorator;

/**
 * @author ckia
 * @title: DecoratorPatternDemo
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午9:46
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        ShapeDecorator2 redCircle2 = new RedShapeDecorator2(new Circle2());
        ShapeDecorator2 redRectangle2 = new RedShapeDecorator2(new Rectangle2());
        System.out.println("=====================================");
        redCircle2.draw(2);
        redRectangle2.draw(3);
    }
}