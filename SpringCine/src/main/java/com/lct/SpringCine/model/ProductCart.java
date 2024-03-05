package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductCart {
    private int id, amount;
    private Cart cart;
    private Product product;
    private double totalPrice;

    public ProductCart(int id, int amount, Cart cart, Product product, double totalPrice) {
        this.id = id;
        this.amount = amount;
        this.cart = cart;
        this.product = product;
        this.totalPrice = totalPrice;
    }

}
