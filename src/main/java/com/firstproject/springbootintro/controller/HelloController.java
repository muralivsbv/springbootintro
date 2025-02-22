package com.firstproject.springbootintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hai")
    public String sayHai(){
        System.out.println("Reached sayHai in hello controller");
        return "Hai, I am Murali Krishna SDE2 - Microsoft ";
    }

    @GetMapping("/appraisal")
    public String sayCongrats(){
        System.out.println("inside congrats method");
        return "Congrats Murali , You got early Promotion as Tech Manager";
    }

    @GetMapping("/offer")
    public String customGreet(@RequestParam("name") String person){
        System.out.println("Inside custom function");
        return "Congrats , You got selected in Google "+person;
    }
}
