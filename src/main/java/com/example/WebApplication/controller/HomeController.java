package com.example.WebApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {

    //MVC - Model View Controller
    @RequestMapping("/")
    //@ResponseBody
    public String homePage(){
        System.out.println("Home page content!");
        return "Home page content!";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "We don't sell products;we value them!";
    }
}
