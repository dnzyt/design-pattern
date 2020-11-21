package com.atguigu.factory.method;

import com.atguigu.factory.BJCheesePizza;
import com.atguigu.factory.BJPepperPizza;
import com.atguigu.factory.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        Pizza p = null;
        if (orderType.equals("cheese")) {
            p = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            p = new BJPepperPizza();
        }
        return p;
    }
}
