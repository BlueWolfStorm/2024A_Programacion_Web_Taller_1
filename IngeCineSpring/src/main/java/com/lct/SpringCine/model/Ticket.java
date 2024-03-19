package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    private int column;
    private char row;
    private FunctionHallSchedule functionHallSchedule;
    private double price;

    public Ticket(int column, char row, FunctionHallSchedule functionHallSchedule, double price) {
        this.column = column;
        this.row = row;
        this.functionHallSchedule = functionHallSchedule;
        this.price = price;
    }
}
