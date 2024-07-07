package dev.ducku.controllers;

import dev.ducku.entities.Product;
import dev.ducku.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Integer addProduct(@RequestBody Product product) {
        return productRepository.save(product).getId();
    }

    @GetMapping("{name}")
    public Product getProductByName(@PathVariable String name) {
        return productRepository.findByName(name);
    }
}
