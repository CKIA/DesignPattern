package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. �м���Ա,��������
 */
public class IntermediateMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("�����м���Ա���ۿ�Ϊ10%");
        return bookPrice * 0.9;
    }
}
