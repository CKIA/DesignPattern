package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. ������Ա
 */
public class PrimaryMember implements Member {

    @Override
    public double calPrice(double bookPrice) {
        System.out.println("���ڳ�����Ա��û���ۿ�");
        return bookPrice;
    }
}
