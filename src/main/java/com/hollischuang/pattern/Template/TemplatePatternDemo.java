package com.hollischuang.pattern.Template;

/**
 * @author ckia
 * @title: TemplatePatternDemo
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:27
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}