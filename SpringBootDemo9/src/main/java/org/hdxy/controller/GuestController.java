package org.hdxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {
    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping("/event")
    public  String event(){
        publisher.publishEvent(new CustomEvent(this));
        return "success";
    }

}
