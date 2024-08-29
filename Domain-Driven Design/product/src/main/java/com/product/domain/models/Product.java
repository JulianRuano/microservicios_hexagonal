package com.product.domain.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;

    public void changePrice(BigDecimal newPrice) {
        if (newPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = newPrice;
    }

    public void adjustQuantity(int adjustment) {
        if (this.quantity + adjustment < 0) {
            throw new IllegalArgumentException("Insufficient quantity");
        }
        this.quantity += adjustment;
    }

    public boolean isAvailable() {
        return this.quantity > 0;
    }
    
}
