package dev.ducku.config.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vi")
public class HelloServiceVietnamese implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Xin chào, " + name + "!";
    }
}
