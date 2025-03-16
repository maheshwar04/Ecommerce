package com.ecommerce.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
