package dev.ducku.main;

import dev.ducku.config.ProjectConfig;
import dev.ducku.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService helloService = context.getBean(HelloService.class);
            helloService.sayHello("Bill");

            System.out.println(helloService.getClass());



        }
    }
}
