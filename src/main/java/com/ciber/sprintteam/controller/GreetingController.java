package com.ciber.sprintteam.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.ciber.sprintteam.model.Greeting;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!, %d";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/")
    public RedirectView  homeRedirect() {
    	log.info("re");
        return new RedirectView ("/greeting");
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name, counter.get()));
    }
}