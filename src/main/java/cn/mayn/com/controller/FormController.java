package cn.mayn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class FormController {


    @RequestMapping("get")
    public String getForm(){
        return "index.html";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String saveHello(){
        String hh = "hello world";
        return hh;
    }
}
