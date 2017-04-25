package com.example.controller;

import com.example.Greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GreetingController {
	
	@Value("${message}")
	String message;

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public Greeting sayHello(@RequestParam String name, HttpServletRequest request) {
        Greeting greeting = new Greeting();
        greeting.setName(name);
        String message = "Hello " + name + "!! Nice meeting you!!";
        greeting.setMessage(this.message + ". " + message);

        request.getSession().setAttribute("greeting", greeting);
        return greeting;
    }

    @RequestMapping(value = "/getSessionInfo", method = RequestMethod.GET, produces = "application/json")
    public Greeting sayHello(HttpServletRequest request) {
        Greeting greeting = (Greeting) request.getSession().getAttribute("greeting");
        return greeting;
    }
}