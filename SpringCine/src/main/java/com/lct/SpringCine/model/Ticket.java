package com.lct.SpringCine.model;

public class Ticket {
    private int id, column;
    private char row;
    private FunctionHallSchedule functionHallSchedule;
    private double price;

    public Ticket(){}

    public Ticket(int id, int column, char row, FunctionHallSchedule functionHallSchedule, double price) {
        this.id = id;
        this.column = column;
        this.row = row;
        this.functionHallSchedule = functionHallSchedule;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public FunctionHallSchedule getFunctionHallSchedule() {
        return functionHallSchedule;
    }

    public void setFunctionHallSchedule(FunctionHallSchedule functionHallSchedule) {
        this.functionHallSchedule = functionHallSchedule;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
