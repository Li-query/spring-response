package com.rui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

    /**
     * s使用重定向的时候,添加 redirect: 前缀,
     *      1.重定向操作也不会经过视图处理器
     *
     * @return
     */
    @RequestMapping("/redirect")
    public String redirect(){
        System.out.println ("redirect");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/redirect2")
    public String redirec2t(){
        System.out.println ("redirect");
        return "redirect:/redirect";
    }
}
