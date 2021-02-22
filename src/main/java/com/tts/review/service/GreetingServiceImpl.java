package com.tts.review.service;

import com.tts.review.model.Greeting;
import com.tts.review.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
//implements GreetingService Interface
public class GreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    //constructor for GreetingServiceImpl
    public GreetingServiceImpl(GreetingRepository greetingRepository){
       this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting getGreeting() {
        Greeting greeting = new Greeting("Hello Friends!");
        return greetingRepository.save(greeting);

    }
}
