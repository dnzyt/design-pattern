package com.atguigu.factory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare making Greek Pizza.");
    }
}
