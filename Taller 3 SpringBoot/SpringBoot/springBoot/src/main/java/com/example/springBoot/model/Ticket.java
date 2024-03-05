package com.example.springBoot.model;

public class Ticket {

    private Function function;
    private Customer customer;
    private float cost;
    private Chair chair;

    public Ticket() {
    }

    public Ticket(int id, Function function, Customer customer,  float cost, Chair chair, Hall hall) {
        this.id = id;
        this.function = function;
        this.customer = customer;
        this.cost = cost;
        this.chair = chair;
        
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
