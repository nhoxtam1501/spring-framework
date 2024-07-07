import dev.ducku.config.MyAppConfig;
import dev.ducku.config.model.Person;
import dev.ducku.config.model.Product;
import dev.ducku.config.repositories.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(MyAppConfig.class)) {
            ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
            Product p = new Product();
            p.setName("strawberry syrup");
            p.setPrice(25);
            //productRepository.save(p);

            //   productRepository.findAll().stream().forEach(System.out::println);

            Person person = context.getBean("person", Person.class);
            person.sayHello("ku");
        }
    }
}
