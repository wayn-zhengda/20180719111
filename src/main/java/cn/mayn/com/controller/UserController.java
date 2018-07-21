package cn.mayn.com.controller;

import cn.mayn.com.model.UserEntity;
import cn.mayn.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("add")
    public void addUser(){

    }

    @RequestMapping("findData")
    public void findData(HttpRequest httpRequest , Model model){
        List<UserEntity> users = new ArrayList<UserEntity>();
        users = userService.findData();
        model.addAttribute("users",users);
//        return users;
    }
}
