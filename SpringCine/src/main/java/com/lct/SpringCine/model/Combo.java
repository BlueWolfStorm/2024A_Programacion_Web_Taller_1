package org.ingecine.model;

import java.util.List;

public class Combo {
    private int id;
    private List<ProductComboAmount> productList;
    private double price, vipPrice;

    public Combo(){}

    public Combo(int id, List<ProductComboAmount> productList, double price, double vipPrice) {
        this.id = id;
        this.productList = productList;
        this.price = price;
        this.vipPrice = vipPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProductComboAmount> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductComboAmount> productList) {
        this.productList = productList;
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
