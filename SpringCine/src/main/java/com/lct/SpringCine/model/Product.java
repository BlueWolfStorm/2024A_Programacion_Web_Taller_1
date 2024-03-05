package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {
    private int id, amount;
    private String name;
    private double price, vipPrice;

    public Product(int id, int amount, String name, double price, double vipPrice) {
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.vipPrice = vipPrice;
    }
}
