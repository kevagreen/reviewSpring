package com.tts.review.service;

import com.tts.review.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {
    //all services must have the method(s) below
    Greeting getGreeting();
}
