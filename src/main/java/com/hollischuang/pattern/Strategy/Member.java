package com.hollischuang.pattern.Strategy;

/**
 * Created by hollis on 16/9/19. ��Ա�ӿ�
 */
public interface Member {

    /**
     * ����Ӧ���۸�
     * 
     * @param bookPrice �鼮ԭ��(��Խ��,����ʹ��BigDecimal,double����ʧ����)
     * @return Ӧ�����
     */
    public double calPrice(double bookPrice);
}
