package com.abg.max.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    // "/hello" endpoint
    @GetMapping("/hello")
    public String getRestHello(){

        String txt1 = "123";
        String txt2 = txt1;

        return String.valueOf(txt1.equals(txt2));
    }



}
