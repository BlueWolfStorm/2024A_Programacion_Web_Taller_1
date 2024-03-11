package com.example.springBoot.model;

import lombok.Getter;


@Getter
@lombok.Setter
public class Ticket {

    private Function function;
    private Customer customer;
    private float cost;
    private Chair chair;

    public Ticket() {
    }

    public Ticket( Function function, Customer customer,  float cost, Chair chair, Hall hall) {

        this.function = function;
        this.customer = customer;
        this.cost = cost;
        this.chair = chair;
        
    }


    @Override
    public String toString() {
        return "Ticket{" +

                ", function=" + function +
                ", customer=" + customer +
                ", cost=" + cost +
                ", chair=" + chair +
                '}';
    }

}
