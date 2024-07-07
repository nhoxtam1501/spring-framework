package dev.ducku.services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello(String name) {
        String message = "Hello " + name;
        System.out.println(message);
        return message;
    }
}
