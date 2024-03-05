package com.example.springBoot.model;

@lombok.Getter
@lombok.Setter
public class Chair {

    private String row;
    private String column;
    private boolean available;
    private String Status;
    private Hall hall;


    public Chair(String row, String column, boolean available, String status) {
        this.row = row;
        this.column = column;
        this.available = available;
        Status = status;
    }

    public Chair() {
    }

    @Override
    public String toString() {
        return "Chair{" +
                ", row='" + row + '\'' +
                ", column='" + column + '\'' +
                '}';
    }
}
