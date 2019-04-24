package com.myfirst.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: GJB
 * @Date: 2019/4/24 14:08
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/boot/hello")
    public @ResponseBody String sayhello(){
        return "Hello SpringBoot1";
    }
}
