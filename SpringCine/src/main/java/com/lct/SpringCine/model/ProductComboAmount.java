package com.lct.SpringCine.model;

public class ProductComboAmount {
    private int id, amount;
    private Product product;
    private Combo combo;
    public ProductComboAmount(){}

    public ProductComboAmount(int id, int amount, Product product, Combo combo) {
        this.id = id;
        this.amount = amount;
        this.product = product;
        this.combo = combo;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }
}
