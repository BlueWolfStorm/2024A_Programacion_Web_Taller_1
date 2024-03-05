package com.example.springBoot.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter
@Setter
public class Receipt {

    private List<Product> products  = new ArrayList<Product>();
    private List<Combo> combos = new ArrayList<Combo>();
    private Customer customer;
    private boolean isDiscount;
    private double discount;
    private double total;
    private LocalDate date;

    public Receipt(List<Product> products, List<Combo> combos, Customer customer, boolean isDiscount, double discount, double total, LocalDate date) {
        this.products = products;
        this.combos = combos;
        this.customer = customer;
        this.isDiscount = isDiscount;
        this.discount = discount;
        this.total = total;
        this.date = date;
    }

    public Receipt() {
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "products=" + products +
                ", combos=" + combos +
                ", customer=" + customer +
                ", isDiscount=" + isDiscount +
                ", discount=" + discount +
                ", total=" + total +
                ", date=" + date +
                '}';
    }
}
