package com.erick.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class helloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "Olá, erick";
    }
}
