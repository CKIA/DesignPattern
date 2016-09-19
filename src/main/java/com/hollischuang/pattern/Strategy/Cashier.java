package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. �鼮�۸���
 */
public class Cashier {

    /**
     * ��Ա,���Զ���
     */
    private Member member;

    public Cashier(Member member){
        this.member = member;
    }

    /**
     * ����Ӧ���Ӹ�
     * 
     * @param booksPrice
     * @return
     */
    public double quote(double booksPrice) {
        return this.member.calPrice(booksPrice);
    }
}
