package com.atguigu.factory;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing BJ Cheese Pizza...");
    }
}
