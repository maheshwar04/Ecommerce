package com.ecommerce.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
