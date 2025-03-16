package com.ecommerce.productservice.service;

import org.springframework.stereotype.Service;

import com.ecommerce.productservice.model.Product;
import com.ecommerce.productservice.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {

        return productRepository.save(product);

    }
    public Optional<Product> getProductsById(Long id) {
       return productRepository.findById(id);
    }
}
