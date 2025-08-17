package com.eafit.tutorial05.controllers;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProductForm {
    
    @NotEmpty(message = "The product name is required")
    private String name;

    @NotEmpty(message = "The product description is required")
    private String description;

    @NotNull(message = "The price is required")
    @Positive(message = "The price must be greater than zero")
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}