package com.lct.SpringCine.controller;

import com.lct.SpringCine.model.Product;

public class ProductController {

    private Product product;

    public ProductController(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        //TODO: This function should return the product.
        return null;
    }

    public void setProduct(Product product) {
        //TODO: This function should set the product.
    }

    public boolean viewProductDetails() {
        //TODO: This function should view product details.
        return false;
    }

    public boolean updatePrice() {
        //TODO: This function should update the price of the product.
        return false;
    }

    public boolean calculatePriceIsVIp(boolean isVip) {
        //TODO: This function should calculate the price if the user is a VIP.
        return false;
    }
}