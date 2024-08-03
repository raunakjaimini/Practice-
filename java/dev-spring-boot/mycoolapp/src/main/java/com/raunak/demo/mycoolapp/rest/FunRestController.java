package com.raunak.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/index")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/Workout")public String getDailyWorkout(){
        return "Run a hard 5k!!!";
    }
}
