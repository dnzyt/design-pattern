package com.atguigu.factory;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing BJ Pepper Pizza...");
    }
}
