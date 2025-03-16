package com.ecommerce.customerservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.customerservice.model.Customer;
import com.ecommerce.customerservice.service.CustomerService;

@RestController

@RequestMapping("/customers")

public class CustomerController {
        
    RestTemplate rest;
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;

    }
    @GetMapping
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {

        return customerService.createCustomer(customer);

    }
    @SuppressWarnings("unchecked")
    @GetMapping("/products")
    public List<Map<String,Object>> getProducts() {
        rest=new RestTemplate();
        return rest.getForObject("http://localhost:8081/products",List.class);
    }
    @SuppressWarnings("unchecked")
    @GetMapping("/orders")
    public List<Map<String,Object>> getOrders() {
        rest=new RestTemplate();
        return rest.getForObject("http://localhost:8083/orders",List.class);
    }
}
