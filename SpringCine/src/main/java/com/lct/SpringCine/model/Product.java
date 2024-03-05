package org.ingecine.model;

public class Product {
    private int id, amount;
    private String name;
    private double price, vipPrice;

    public Product(){}

    public Product(int id, int amount, String name, double price, double vipPrice) {
        this.id = id;
        this.amount = amount;
        this.name = name;
        this.price = price;
        this.vipPrice = vipPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(double vipPrice) {
        this.vipPrice = vipPrice;
    }
}
