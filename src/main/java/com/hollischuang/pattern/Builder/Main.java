package com.hollischuang.pattern.Builder;

/**
 * Created by hollis on 16/5/3.
 */
public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder commonBuilder = new CommonRoleBuilder();

        director.construct(commonBuilder);
        Role commonRole = commonBuilder.getResult();
        System.out.println(commonRole);

        SuperRoleBuilder superRoleBuilder = new SuperRoleBuilder();
        director.construct(superRoleBuilder);
        Role result = superRoleBuilder.getResult();
        System.out.println(result);
        System.out.println("result:"+result+",commonRole:"+commonRole);
    }
}
