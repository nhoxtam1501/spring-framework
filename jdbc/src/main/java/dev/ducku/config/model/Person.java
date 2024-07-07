package dev.ducku.config.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private final HelloService helloService;

    public Person(@Qualifier("vi") HelloService helloService) {
        this.helloService = helloService;
    }

    public void sayHello(String name) {
        String msg = helloService.sayHello(name);
        System.out.println(msg);
    }
}
