package com.hollischuang.pattern.Adapter;

/**
 * @author ckia
 * @title: VoltageAdapter2
 * @projectName DesignPattern
 * @description: TODO
 * @date 19-6-6下午5:15
 */
public class VoltageAdapter2 implements Voltage5 {
    private Voltage220 mVoltage220;

    public VoltageAdapter2(Voltage220 voltage220) {
        mVoltage220 = voltage220;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != mVoltage220) {
            int src = mVoltage220.output220V();
            System.out.println("对象适配器工作，开始适配电压");
            dst = src / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;
    }
}