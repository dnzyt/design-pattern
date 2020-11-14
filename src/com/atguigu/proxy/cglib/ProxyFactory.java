package com.atguigu.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object o) {
        this.target = o;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(
            Object o,
            Method method,
            Object[] objects,
            MethodProxy methodProxy) throws Throwable {
        System.out.println("Before teaching...");
        Object res = method.invoke(target, objects);
        System.out.println("After teaching...");
        return res;
    }
}
