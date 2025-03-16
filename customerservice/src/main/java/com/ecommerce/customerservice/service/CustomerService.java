package com.ecommerce.customerservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.customerservice.model.Customer;
import com.ecommerce.customerservice.repository.CustomerRepository;

@Service

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;

    }

    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();

    }

    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);

    }

}
