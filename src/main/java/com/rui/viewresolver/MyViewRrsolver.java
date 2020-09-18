package com.rui.viewresolver;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@Component
@Order(1)
public class MyViewRrsolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if(viewName.startsWith ("msb:")){
            System.out.println (viewName);
            return new MyView ();
        }else {
            return null;
        }
    }
}
