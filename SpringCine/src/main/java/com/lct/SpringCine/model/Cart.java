package org.ingecine.model;

import java.util.List;

public class Cart {
    private int id;
    private User user;
    private List<Ticket> ticketList;
    private List<ProductCart> productList;
    private List<ComboCart> comboList;
    private double totalPrice;

    public Cart(){}

    public Cart(int id, User user, List<Ticket> ticketList, List<ProductCart> productList, List<ComboCart> comboList, double totalPrice) {
        this.id = id;
        this.user = user;
        this.ticketList = ticketList;
        this.productList = productList;
        this.comboList = comboList;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public List<ProductCart> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductCart> productList) {
        this.productList = productList;
    }

    public List<ComboCart> getComboList() {
        return comboList;
    }

    public void setComboList(List<ComboCart> comboList) {
        this.comboList = comboList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
