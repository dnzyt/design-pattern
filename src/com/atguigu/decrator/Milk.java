package com.atguigu.decrator;

public class Milk extends Decrator {
    public Milk(Drink drink) {
        super(drink);
        setDesc("Milk");
        setPrice(2.0f);
    }
}
