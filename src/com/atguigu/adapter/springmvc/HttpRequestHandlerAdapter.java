package com.atguigu.adapter.springmvc;

public class HttpRequestHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object controller) {
        if (controller instanceof HttpRequestController)
            return true;
        return false;
    }

    @Override
    public Object handle(Object controller) {
        HttpRequestController h = (HttpRequestController)controller;
        h.doHttpRequest();
        return null;
    }
}
