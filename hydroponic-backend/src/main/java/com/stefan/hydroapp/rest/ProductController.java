package com.stefan.hydroapp.rest;

import com.stefan.hydroapp.dto.productapi.Product;
import com.stefan.hydroapp.dto.productapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
