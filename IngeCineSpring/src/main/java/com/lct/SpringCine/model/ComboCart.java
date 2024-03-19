package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ComboCart {
    private int amount;
    private Cart cart;
    private Combo combo;
    private double totalPrice;

    public ComboCart(int amount, Cart cart, Combo combo, double totalPrice) {
        this.amount = amount;
        this.cart = cart;
        this.combo = combo;
        this.totalPrice = totalPrice;
    }
}
