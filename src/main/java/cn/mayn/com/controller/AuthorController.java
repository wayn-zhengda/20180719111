package cn.mayn.com.controller;


import org.apache.http.HttpResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @RequestMapping("login")
    public void login(HttpRequest httpRequest, HttpResponse httpResponse){
        HttpHeaders httpHeaders = httpRequest.getHeaders();
        String origin = httpHeaders.getOrigin();
        if (!StringUtils.isEmpty(origin)){
            httpResponse.addHeader("","");
         httpHeaders.getOrigin();
        }
        
    }
}
