package cn.mayn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class FormController {


    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("getData")
    @ResponseBody
    public String getData(){
        String hh = "hello world";
        return hh;
    }

    @RequestMapping("jstl")
    public String TestJstl(){
        return "fristDemo";
    }
}
