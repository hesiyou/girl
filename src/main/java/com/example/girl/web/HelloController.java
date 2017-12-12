package com.example.girl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @RequestMapping(value="/hello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
