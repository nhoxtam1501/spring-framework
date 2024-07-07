package dev.ducku.springe910.controllers;

import dev.ducku.springe910.dto.ProductDTO;
import dev.ducku.springe910.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping
    public int addProduct(@RequestBody ProductDTO productDTO) {
        return productService.save(productDTO);
    }

}
