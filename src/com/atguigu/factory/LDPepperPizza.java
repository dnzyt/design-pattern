package com.atguigu.factory;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing LD Pepper Pizza...");
    }
}
