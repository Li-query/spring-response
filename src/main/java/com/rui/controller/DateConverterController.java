package com.rui.controller;

import com.rui.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 如果使用默认的类型转换器,那么再输入日期的时候必须要使用/作为分割,如果需要自定义实现,该如何操作?
 *
 * 如果需要添加日期格式转换器,只需要在实体类上添加@DateTimeFromat("格式")即可;
 * 但是需要注意的是:  如果在配置日期格式化器的时候,同时配置了类型转换器,那么此时就会失效,需要使用FormattingConversionServiceFactoryBean对象
 */
@Controller
public class DateConverterController {

    @RequestMapping("/testDateConverter")
    public String testDateConverter(User user){
        System.out.println (user);
        return "success";
    }
}
