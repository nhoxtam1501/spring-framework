package dev.ducku.config.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("en")
public class HelloServiceEnglish implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
