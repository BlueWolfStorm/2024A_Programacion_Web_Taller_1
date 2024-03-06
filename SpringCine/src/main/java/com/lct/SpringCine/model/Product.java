package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private int amount;
    private String name;
    private double price, vipPrice;

    public Product(int amount, String name, double price, double vipPrice) {
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.vipPrice = vipPrice;
    }
}
