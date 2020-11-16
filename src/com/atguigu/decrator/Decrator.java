package com.atguigu.decrator;

public class Decrator extends Drink {
    private Drink obj;

    public Decrator(Drink drink) {
        obj = drink;
    }

    @Override
    public float cost() {
        return getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {
        return getDesc() + " " + obj.getDesc();
    }
}
