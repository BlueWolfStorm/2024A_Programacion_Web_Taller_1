package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Cart {
    private int id;
    private User user;
    private List<Ticket> ticketList;
    private List<ProductCart> productList;
    private List<ComboCart> comboList;
    private double totalPrice;


    public Cart(int id, User user, List<Ticket> ticketList, List<ProductCart> productList, List<ComboCart> comboList, double totalPrice) {
        this.id = id;
        this.user = user;
        this.ticketList = ticketList;
        this.productList = productList;
        this.comboList = comboList;
        this.totalPrice = totalPrice;
    }

}
