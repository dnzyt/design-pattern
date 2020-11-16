package com.atguigu.decrator;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Soy(order);
        System.out.println("Chocolate - milk - soy - long black: " + order.cost());

    }
}
