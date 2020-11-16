package com.atguigu.decrator;

public class Chocolate extends Decrator {

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("Chocolate");
        setPrice(3.0f);
    }
}
