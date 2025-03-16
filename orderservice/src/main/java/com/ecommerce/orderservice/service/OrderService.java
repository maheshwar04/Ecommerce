package com.ecommerce.orderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.orderservice.model.Order;
import com.ecommerce.orderservice.repository.OrderRepository;

@Service

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {

        this.orderRepository = orderRepository;

    }

    public List<Order> getAllOrders() {

        return orderRepository.findAll();

    }

    public Order createOrder(Order order) {

        return orderRepository.save(order);

    }

}