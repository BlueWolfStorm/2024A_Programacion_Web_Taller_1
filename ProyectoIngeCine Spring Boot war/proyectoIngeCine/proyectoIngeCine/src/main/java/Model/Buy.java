/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class Buy {
    private String purchaseld;
    private User user;
    private double total;
    private Date date;
    private List<Product> products;

    public String getPurchaseld() {
        return purchaseld;
    }

    public void setPurchaseld(String purchaseld) {
        this.purchaseld = purchaseld;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Buy() {
    }

    public Buy(String purchaseld, User user, double total, Date date, List<Product> products) {
        this.purchaseld = purchaseld;
        this.user = user;
        this.total = total;
        this.date = date;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "purchaseld='" + purchaseld + '\'' +
                ", user=" + user +
                ", total=" + total +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}
