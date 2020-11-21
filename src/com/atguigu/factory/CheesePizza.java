package com.atguigu.factory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare making cheese pizza");
    }
}
