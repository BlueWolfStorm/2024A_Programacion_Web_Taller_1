package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Combo {
    private int id;
    private List<ProductComboAmount> productList;
    private double price, vipPrice;

    public Combo(int id, List<ProductComboAmount> productList, double price, double vipPrice) {
        this.id = id;
        this.productList = productList;
        this.price = price;
        this.vipPrice = vipPrice;
    }

}
