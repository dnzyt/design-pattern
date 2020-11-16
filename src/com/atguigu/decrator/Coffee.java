package com.atguigu.decrator;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return getPrice();
    }
}
