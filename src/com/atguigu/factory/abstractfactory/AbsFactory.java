package com.atguigu.factory.abstractfactory;

import com.atguigu.factory.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
