package com.hollischuang.pattern.Template;

/**
 * @author ckia
 * @title: Cricket
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:26
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}