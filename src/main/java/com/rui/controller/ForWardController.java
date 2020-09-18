package com.rui.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForWardController {

    /**
     * 在使用转发的时候,在前面要添加   forward:  前缀,同时通过写的字符串能够看到forward请求不经过视图处理器
     *
     * 转发的时候,除了可以转发回到页面之外,还可以转发到其他请求中.
     * @return
     */
    @RequestMapping("/forward")
    public String forward(){
        System.out.println ("forward");
        return "forward:/index.jsp";
    }

    @RequestMapping("forward2")
    public String forward2(){
        System.out.println ("forward 2....");
        return "forward:/forward";

    }
}
