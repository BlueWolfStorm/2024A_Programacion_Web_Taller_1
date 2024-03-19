package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductComboAmount {
    private int amount;
    private Product product;
    private Combo combo;

    public ProductComboAmount(int amount, Product product, Combo combo) {
        this.amount = amount;
        this.product = product;
        this.combo = combo;
    }
}
