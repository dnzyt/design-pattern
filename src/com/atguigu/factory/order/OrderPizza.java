package com.atguigu.factory.order;

import com.atguigu.factory.CheesePizza;
import com.atguigu.factory.GreekPizza;
import com.atguigu.factory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getPizzaType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("Greek Pizza");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("Cheese Pizza");
//            } else {
//                break;
//            }
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//        } while (true);
//    }

    private SimpleFactory sf;
    private Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSf(simpleFactory);
    }

    public void setSf(SimpleFactory simpleFactory) {
        sf = simpleFactory;
        String orderType = "";
        do {
            orderType = getPizzaType();
            pizza = this.sf.createPizza(orderType);
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                break;
            } else {
                System.out.println("Order Pizza failed.");
            }
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
