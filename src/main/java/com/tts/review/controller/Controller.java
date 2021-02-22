package com.tts.review.controller;

import com.tts.review.model.Greeting;
import com.tts.review.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//controller that will define a restful endpoint for a message
@RestController
public class Controller {

    GreetingService greetingService;
    //GreetingServiceImpl has @Service and spring knows to use that
    public Controller(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    //implement GET
    @GetMapping("/hello")
    public Greeting getHello(){
     return greetingService.getGreeting();
    }
}
