package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ticket {
    private int id, column;
    private char row;
    private FunctionHallSchedule functionHallSchedule;
    private double price;

    public Ticket(int id, int column, char row, FunctionHallSchedule functionHallSchedule, double price) {
        this.id = id;
        this.column = column;
        this.row = row;
        this.functionHallSchedule = functionHallSchedule;
        this.price = price;
    }
}
