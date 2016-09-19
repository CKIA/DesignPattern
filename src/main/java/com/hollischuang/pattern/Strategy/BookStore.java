package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19.
 */
public class BookStore {

    public static void main(String[] args) {

        //ѡ�񲢴�����Ҫʹ�õĲ��Զ���
        Member strategy = new AdvancedMember();
        //��������
        Cashier cashier = new Cashier(strategy);
        //����۸�
        double quote = cashier.quote(300);
        System.out.println("�߼���Աͼ������ռ۸�Ϊ��" + quote);

        strategy = new IntermediateMember();
        cashier = new Cashier(strategy);
        quote = cashier.quote(300);
        System.out.println("�м���Աͼ������ռ۸�Ϊ��" + quote);
    }
}
