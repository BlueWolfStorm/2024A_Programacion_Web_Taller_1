package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class HallChair {
    private int id, columnLength;
    private Hall hall;
    private char rowLetter;
    private List<Integer> vipChairs;
    private double chairPrice, vipChairPrice;

    public HallChair(int id, int columnLength, Hall hall, char rowLetter, List<Integer> vipChairs, double chairPrice, double vipChairPrice) {
        this.id = id;
        this.columnLength = columnLength;
        this.hall = hall;
        this.rowLetter = rowLetter;
        this.vipChairs = vipChairs;
        this.chairPrice = chairPrice;
        this.vipChairPrice = vipChairPrice;
    }
}
