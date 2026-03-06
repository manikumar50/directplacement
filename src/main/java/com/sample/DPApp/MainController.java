package com.sample.DPApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//tomcat -> 8080

// MVC + REST
//@Controller // Controller + Component
//@ResponseBody
@RestController // Controller + ResponseBody
public class MainController
{
    @GetMapping("/getHello") // endpoint + GET
//    @ResponseBody // no need
    public String helloWorld()
    {
        return "home"; // String
        // Hello World! -> html
        // home.html
    }

    @GetMapping("/hi")
//    @ResponseBody -> no need
    public String sayHi()
    {
        return "hi";
    }
}