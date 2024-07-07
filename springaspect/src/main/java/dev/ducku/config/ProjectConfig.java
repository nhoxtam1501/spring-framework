package dev.ducku.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;




@Configuration
@ComponentScan("dev")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public PrototypeClass prototypeClass() {
        return new PrototypeClass();
    }

    @Bean
    public SingletonClass singletonClass() {
        return new SingletonClass();
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public class PrototypeClass {
        public void hello() {
            System.out.println("PrototypeClass.hello()");
        }
    }

    public class SingletonClass {
        public void hello() {
            System.out.println("SingletonClass.hello()");
        }
    }
}
