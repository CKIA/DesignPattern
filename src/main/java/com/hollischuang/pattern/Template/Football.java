package com.hollischuang.pattern.Template;

/**
 * @author ckia
 * @title: Football
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:27
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
