package com.ness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.faces.annotation.RequestMap;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

}
