package com.hollischuang.pattern.Adapter;

/**
 * @author ckia
 * @title: Mobile
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午5:14
 */
public class Mobile {
    /**
     * 充电方法
     *
     * @param voltage5
     */
    public void charging(Voltage5 voltage5) {
        if (voltage5.output5V() == 5) {
            System.out.println("电压刚刚好5V，开始充电");
        } else if (voltage5.output5V() > 5) {
            System.out.println("电压超过5V，都闪开 我要变成note7了");
        }
    }

    public static void main(String[] args) {
        System.out.println("===============类适配器==============");
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter());

        System.out.println("===============对象适配器==============");
        VoltageAdapter2 voltageAdapter2 = new VoltageAdapter2(new Voltage220());
        Mobile mobile2 = new Mobile();
        mobile2.charging(voltageAdapter2);

        AdapterInteface adapterInteface = new AdapterInteface() {
            @Override
            public void printA() {
                System.out.println("A");
            }

            @Override
            public void printB() {

            }
        };
        adapterInteface.printA();
    }
}
