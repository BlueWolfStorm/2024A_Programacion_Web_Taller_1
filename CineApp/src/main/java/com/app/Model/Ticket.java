package com.app.Model;

import com.app.Model.Customer;
import com.app.Model.Sesion;

public class Ticket {
    private Customer customer;
    private Sesion sesion;
    private double price;


    public Ticket() {
    }

    public Ticket(Customer customer, Sesion sesion, double price) {
        this.customer = customer;
        this.sesion = sesion;
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "customer=" + customer +
                ", sesion=" + sesion +
                ", price=" + price +
                '}';
    }
}
