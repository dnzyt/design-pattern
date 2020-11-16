package com.atguigu.decrator;

public class Soy extends Decrator {
    public Soy(Drink drink) {
        super(drink);
        setDesc("Soy");
        setPrice(1.0f);
    }
}
