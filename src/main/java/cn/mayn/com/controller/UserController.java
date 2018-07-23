package cn.mayn.com.controller;

import cn.mayn.com.model.UserEntity;
import cn.mayn.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

//    @Autowired
//    UserService userService;

    @RequestMapping("index")
    public String getIndex(Model model){
        Map<String,String> users = new HashMap<>();
        users.put("uid","001");
        users.put("userName","001");
        users.put("age","001");
        users.put("sex","001");
        model.addAttribute("users",users);
    return "bootstrpTable";
    }

    @RequestMapping("add")
    public void addUser(){

    }

    @RequestMapping("findData")
    @ResponseBody
    public void findData(HttpRequest httpRequest , Model model){
//        List<UserEntity> users = new ArrayList<UserEntity>();
//        users = userService.findData();
        Map<String,String> users = new HashMap<>();
        users.put("id","001");
        users.put("userName","001");
        users.put("age","001");
        users.put("sex","001");
        model.addAttribute("users",users);
//        return users;
    }
}
