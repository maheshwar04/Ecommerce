package com.ecommerce.orderservice.controller;

import java.util.List;
import java.util.Map;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.orderservice.model.Order;
import com.ecommerce.orderservice.service.OrderService;

@RestController

@RequestMapping("/orders")

public class OrderController {

    private final OrderService orderService;

    RestTemplate rest;

    public OrderController(OrderService orderService) {

        this.orderService = orderService;

    }

    @GetMapping

    public List<Order> getAllOrders() {

        return orderService.getAllOrders();

    }

    @PostMapping

    public Order createOrder(@RequestBody Order order) {

        return orderService.createOrder(order);

    }

    @SuppressWarnings("unchecked")
    @GetMapping("/products")
    public List<Map<String,Object>> getProducts() {
        rest=new RestTemplate();
        return rest.getForObject("http://localhost:8081/products",List.class);
    }
    @SuppressWarnings("unchecked")
    @GetMapping("/products/{id}")
    public ResponseEntity<Map<String,Object>> getProductsById(@PathVariable Long id) {
        rest=new RestTemplate();
        String url="http://localhost:8081/products/"+id;
        Map<String,Object> product=rest.getForObject(url,Map.class);
        return ResponseEntity.ok(product);
    }
}
