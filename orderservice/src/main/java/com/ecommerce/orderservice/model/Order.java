package com.ecommerce.orderservice.model;

import jakarta.persistence.*;

@Entity
@Table(name="Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long productId;
    private int quantity;
    public Order() {}
    public Order(Long id, Long customerId, Long productId, int quantity) {

        this.id = id;

        this.customerId = customerId;

        this.productId = productId;

        this.quantity = quantity;

    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getCustomerId() { return customerId; }

    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public Long getProductId() { return productId; }

    public void setProductId(Long productId) { this.productId = productId; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

}

