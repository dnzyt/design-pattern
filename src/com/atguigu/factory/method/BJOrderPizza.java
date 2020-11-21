package com.atguigu.factory.method;

import com.atguigu.factory.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    protected Pizza createPizza(String orderType) {
        return null;
    }
}
