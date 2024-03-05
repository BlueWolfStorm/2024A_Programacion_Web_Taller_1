package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ComboCart {
    private int id, amount;
    private Cart cart;
    private Combo combo;
    private double totalPrice;

    public ComboCart(int id, int amount, Cart cart, Combo combo, double totalPrice) {
        this.id = id;
        this.amount = amount;
        this.cart = cart;
        this.combo = combo;
        this.totalPrice = totalPrice;
    }
}
