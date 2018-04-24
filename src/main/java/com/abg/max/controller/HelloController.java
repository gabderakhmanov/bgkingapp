package com.abg.max.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "index";
    }

    @RequestMapping("/about")
    public String showUserPage(ModelMap model){
        model.addAttribute("text", "this is about page");
        return "about";
    }

    @RequestMapping(value = "hi/{fullName}", method = RequestMethod.GET)
    public String showHiPage(@PathVariable("fullName") String fullName, ModelMap model){

        model.addAttribute("nameFromURL", fullName);

        return "hi";
    }

}
