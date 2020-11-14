package com.atguigu.adapter.springmvc;

public interface HandlerAdapter {
    public boolean supports(Object controller);
    public Object handle(Object controller);
}
