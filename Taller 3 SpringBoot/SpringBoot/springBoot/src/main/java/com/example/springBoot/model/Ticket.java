package com.example.springBoot.model;

public class Ticket {

    int id;

    Function function;
    Customer customer;
    Combo combo;
    float cost;
    Chair chair;
    Hall hall;

    public Ticket() {
    }

    public Ticket(int id, Function function, Customer customer, Combo combo, float cost, Chair chair, Hall hall) {
        this.id = id;
        this.function = function;
        this.customer = customer;
        this.combo = combo;
        this.cost = cost;
        this.chair = chair;
        this.hall = hall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", function=" + function +
                ", customer=" + customer +
                ", combo=" + combo +
                ", cost=" + cost +
                ", chair=" + chair +
                ", hall=" + hall +
                '}';
    }

}
