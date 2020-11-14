package com.atguigu.adapter.springmvc;

public class SimpleControllerHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object controller) {
        if (controller instanceof SimpleController)
            return true;
        return false;
    }

    @Override
    public Object handle(Object controller) {
        SimpleController h = (SimpleController)controller;
        h.doSimpleProcess();
        return null;
    }
}
