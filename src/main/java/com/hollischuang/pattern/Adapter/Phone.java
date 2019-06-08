package com.hollischuang.pattern.Adapter;

/**
 * @author ckia
 * @title: Phone
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午4:56
 */
public abstract class Phone <T> {

    protected T lightningSuperInterface;

    protected void setLightningInterface(T lightningInterface) {
        this.lightningSuperInterface = lightningInterface;
    }

    public abstract void charge();
}
