package com.atguigu.factory;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing LD Cheese Pizza...");
    }
}
