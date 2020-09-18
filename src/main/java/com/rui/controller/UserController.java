package com.rui.controller;


import com.rui.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在使用@ModelAttribute的时候,需要注意:
 *  1.如果参数中的注解没有写名字的话,默认是用参数名称的首字母小写来匹配的\
 *  2.如果有值,直接返回;如果没有值,会去Session中查找,也就是说,会判断当前类上是否添加了@SessionAttributes注解,
 *
 *
 *  推荐注解中最好添加参数来作为唯一标识进行对象属性的赋值
 */

@Controller
public class UserController {

    @RequestMapping("/updata")
    public String updata(@ModelAttribute("user") User user){
        System.out.println (user);
        return "success";
    }

    @ModelAttribute
    public void testModelAttribute(Model model){
        User user = new User ();
        user.setId (1);
        user.setName ("李四");
        user.setAge (23);
        user.setPassword ("123456");
        user.setGender ("man");
        model.addAttribute ("user",user);

    }
}
