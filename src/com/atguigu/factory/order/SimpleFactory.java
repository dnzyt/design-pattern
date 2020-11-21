package com.atguigu.factory.order;

import com.atguigu.factory.CheesePizza;
import com.atguigu.factory.GreekPizza;
import com.atguigu.factory.PepperPizza;
import com.atguigu.factory.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        return getPizza(orderType);
    }

    private Pizza getPizza(String orderType) {
        return getPizza(orderType);
    }

    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("Simple factory patter");
        switch (orderType) {
            case "greek":
                pizza = new GreekPizza();
                pizza.setName("Greek Pizza");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName("Cheese Pizza");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("Pepper Pizza");
                break;
        }
        return pizza;
    }
}
