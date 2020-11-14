package com.atguigu.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet {
    List<HandlerAdapter> adapters = new ArrayList<>();

    public DispatcherServlet() {
        adapters.add(new SimpleControllerHandlerAdapter());
        adapters.add(new HttpRequestHandlerAdapter());
        adapters.add(new AnnotationControllerHandlerAdapter());
    }

    public Object doDispatch(String request) {
        Object controller = null;
        if (request.equals("http"))
            controller = new HttpRequestController();
        else if (request.equals("annotation"))
            controller = new AnnotationController();
        else if (request.equals("simple"))
            controller = new SimpleController();

        for (HandlerAdapter ha: adapters) {
            if (ha.supports(controller))
                return ha.handle(controller);
        }
        return null;
    }
}
