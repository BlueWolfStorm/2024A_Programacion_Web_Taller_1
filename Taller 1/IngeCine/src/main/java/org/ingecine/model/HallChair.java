package org.ingecine.model;

import java.util.List;

public class HallChair {
    private int id, columnLength;
    private Hall hall;
    private char rowLetter;
    private List<Integer> vipChairs;
    private double chairPrice, vipChairPrice;

    public HallChair() {
    }

    public HallChair(int id, int columnLength, Hall hall, char rowLetter, List<Integer> vipChairs, double chairPrice, double vipChairPrice) {
        this.id = id;
        this.columnLength = columnLength;
        this.hall = hall;
        this.rowLetter = rowLetter;
        this.vipChairs = vipChairs;
        this.chairPrice = chairPrice;
        this.vipChairPrice = vipChairPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColumnLength() {
        return columnLength;
    }

    public void setColumnLength(int columnLength) {
        this.columnLength = columnLength;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public char getRowLetter() {
        return rowLetter;
    }

    public void setRowLetter(char rowLetter) {
        this.rowLetter = rowLetter;
    }

    public List<Integer> getVipChairs() {
        return vipChairs;
    }

    public void setVipChairs(List<Integer> vipChairs) {
        this.vipChairs = vipChairs;
    }

    public double getChairPrice() {
        return chairPrice;
    }

    public void setChairPrice(double chairPrice) {
        this.chairPrice = chairPrice;
    }

    public double getVipChairPrice() {
        return vipChairPrice;
    }

    public void setVipChairPrice(double vipChairPrice) {
        this.vipChairPrice = vipChairPrice;
    }
}
