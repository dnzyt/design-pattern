package com.atguigu.factory.order;

public class PizzaStore {
    public static void main(String[] args) {
//        OrderPizza order = new OrderPizza();
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());

    }
}
