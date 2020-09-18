package com.rui.controller;

import com.rui.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义类型转换器的时候,一定要注意对应的属性值 跟方法中参数的值要对应起来
 */
@Controller
public class MyConverterController {

    @RequestMapping("/converter")
    public String testConverter(User user, Model model, HttpServletRequest request){
//        String source = request.getParameter ("source");
        System.out.println (user);
        model.addAttribute ("user",user);
        return "success";
    }
}
