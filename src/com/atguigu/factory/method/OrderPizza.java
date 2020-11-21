package com.atguigu.factory.method;

import com.atguigu.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    protected abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        String orderType = "";
        Pizza pizza = null;
        do {
            orderType = getPizzaType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getPizzaType() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza type:");
            String t = bf.readLine();
            return t;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
