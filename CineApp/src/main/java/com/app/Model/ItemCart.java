package com.app.Model;

public class ItemCart {
    private Ticket ticket;
    private Product product;
    private int quantity;

    public ItemCart() {
    }

    public ItemCart(Ticket ticket, Product product, int quantity) {
        this.ticket = ticket;
        this.product = product;
        this.quantity = quantity;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemCart{" +
                "ticket=" + ticket +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
