package com.lct.SpringCine.model;

public class ProductCart {
    private int id, amount;
    private Cart cart;
    private Product product;
    private double totalPrice;

    public ProductCart(){}

    public ProductCart(int id, int amount, Cart cart, Product product, double totalPrice) {
        this.id = id;
        this.amount = amount;
        this.cart = cart;
        this.product = product;
        this.totalPrice = totalPrice;
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
