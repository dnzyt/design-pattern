package com.atguigu.factory;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare making Pepper Pizza.");
    }
}
