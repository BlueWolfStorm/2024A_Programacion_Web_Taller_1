package com.example.springBoot.model;

public class Chair {

    int id;
    String row;
    String column;

    public Chair(int id) {
        this.id = id;
    }

    public Chair() {
    }

    public Chair(int id, String row, String column) {
        this.id = id;
        this.row = row;
        this.column = column;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id=" + id +
                ", row='" + row + '\'' +
                ", column='" + column + '\'' +
                '}';
    }
}
