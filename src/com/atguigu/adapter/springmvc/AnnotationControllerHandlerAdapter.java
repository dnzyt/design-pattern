package com.atguigu.adapter.springmvc;

public class AnnotationControllerHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object controller) {
        if (controller instanceof AnnotationController)
            return true;
        return false;
    }

    @Override
    public Object handle(Object controller) {
        AnnotationController h = (AnnotationController)controller;
        h.doAnnotationProcess();

        return null;
    }
}
