package com.example.receipe_sharing.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//    @GetMapping("")
    public String HomeController(){
        return "welcome back";
    }
}