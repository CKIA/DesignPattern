package com.hollischuang.pattern.Adapter;

/**
 * @author ckia
 * @title: Iphone6
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午5:00
 */
public class Iphone6 extends Phone<LightningSuperInterface> {

    private Iphone6() {
    }

    public Iphone6(LightningSuperInterface light) {
        super.setLightningInterface(light);
    }

    @Override
    public void charge() {
        System.out.println("开始给我的Iphone6手机充电...");
        super.lightningSuperInterface.chargeWithLightning();
        System.out.println("结束给我的Iphone6手机充电...");
    }
}
