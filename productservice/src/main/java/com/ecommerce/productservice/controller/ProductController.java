package com.ecommerce.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productservice.model.Product;
import com.ecommerce.productservice.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {

        this.productService = productService;

    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @GetMapping("/{id}")
    public Optional<Product> getProductsById(@PathVariable Long id) {
        return productService.getProductsById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {

        return productService.createProduct(product);
    }

}