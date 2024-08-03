package demoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Helloworld {
    @RequestMapping("/")
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String greet(){
        return "hello world";

    }
    
}
