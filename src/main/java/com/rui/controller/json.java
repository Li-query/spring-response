package com.rui.controller;


import com.rui.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


public class json {
    @Controller
    public class Json {

        @ResponseBody
        @RequestMapping("/json")
        public  List<User> json(){
            List<User> list = new ArrayList<User> ();
            list.add (new User (1,"zhangsan","sss",12,"man"));

            return list;
        }

        @ResponseBody
        @RequestMapping("/json2")
        public String json2(){
            return "-------";
        }
    }
}
