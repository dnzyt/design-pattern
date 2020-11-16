package com.atguigu.decrator;

/*
*
* 装饰器和单品咖啡都继承于同一接口Drink, 但是装饰器中需要包含一个Drink的属性，用来装饰单品咖啡
*
* */

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Soy(order);
        System.out.println("Chocolate - milk - soy - long black: " + order.cost());

    }
}

