package com.skillstorm.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groceryId;

    private String description;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderInfo order;

    public GroceryItem(Long groceryId, String description, int quantity, OrderInfo order) {
        this.groceryId = groceryId;
        this.description = description;
        this.quantity = quantity;
        this.order = order;
    }

    public Long getGroceryId() {
        return groceryId;
    }

    public void setGroceryId(Long groceryId) {
        this.groceryId = groceryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderInfo getOrder() {
        return order;
    }

    public void setOrder(OrderInfo order) {
        this.order = order;
    }

    
}