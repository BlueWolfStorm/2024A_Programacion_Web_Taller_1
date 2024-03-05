package com.example.springBoot.model;

import lombok.Getter;

@Getter
@lombok.Setter
public class Product {

    private String name;
    private double price;
    private String description;
    private int stock;
    private int porcentageDiscount;
    private boolean isDiscount;

    public Product() {
    }

    public Product(String name, double price, String description, int stock, int porcentageDiscount, boolean isDiscount) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.porcentageDiscount = porcentageDiscount;
        this.isDiscount = isDiscount;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", porcentageDiscount=" + porcentageDiscount +
                ", isDiscount=" + isDiscount +
                '}';
    }
}
