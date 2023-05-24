package com.wpeng.trsrd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Index(){
        return "html/home";
    }

    @RequestMapping("/home")
    public String Home(){
        return "html/home";
    }

    @RequestMapping("/search")
    public String Search(){
        return "html/search";
    }

    @RequestMapping("/browse")
    public String Browse(){
        return "html/browse";
    }

    @RequestMapping("/download")
    public String Download(){
        return "html/download";
    }

    @RequestMapping("/about")
    public String About(){
        return "html/about";
    }
}
