package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. �߼���Ա,��������
 */
public class AdvancedMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("�����м���Ա���ۿ�Ϊ20%");
        return bookPrice * 0.8;
    }
}
