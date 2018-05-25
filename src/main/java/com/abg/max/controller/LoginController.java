package com.abg.max.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "fancy-login";
    }

    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }

}