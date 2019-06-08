package com.hollischuang.pattern.Template;

/**
 * @author ckia
 * @title: Game
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午10:26
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}