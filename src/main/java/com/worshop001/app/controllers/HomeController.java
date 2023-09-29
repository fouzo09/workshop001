package com.worshop001.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String index(){
        return "AWS UG Conakry workshop #001";
    }
}
