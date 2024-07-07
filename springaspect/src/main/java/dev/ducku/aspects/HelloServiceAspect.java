package dev.ducku.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Around("execution(* dev.ducku.services.HelloService.sayHello(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("B4");
        Object result = null;
        try {
            result = joinPoint.proceed(new Object[] {"John Cena"});

            System.out.println("After");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
