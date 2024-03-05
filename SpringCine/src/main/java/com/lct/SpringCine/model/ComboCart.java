package org.ingecine.model;

public class ComboCart {
    private int id, amount;
    private Cart cart;
    private Combo combo;
    private double totalPrice;

    public ComboCart(){}

    public ComboCart(int id, int amount, Cart cart, Combo combo, double totalPrice) {
        this.id = id;
        this.amount = amount;
        this.cart = cart;
        this.combo = combo;
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

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
