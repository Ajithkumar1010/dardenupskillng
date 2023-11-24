package com.example.microserivetask.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller to make a java class as a spring mvc controller
//@ResponseBody tells a controller that the obj returned is automatically seralized into JSON and passed back into the httpresponse obj
@RestController
public class HelloWorldController {

    //HTTP get request
    //use to map HTTP get request onto specific handler method
    //http://localhost:8080/hello-world

    @GetMapping ("/hello-world")
    public String helloWorld(){
        return "hello world";
    }
}
