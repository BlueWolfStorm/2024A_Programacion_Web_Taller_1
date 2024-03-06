package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class HallChair {
    private Hall hall;
    private char row;
    private int column;
    private boolean isVip, isOccupied, isDamaged;
    private double chairPrice, vipChairPrice;

    public HallChair(Hall hall, char row, int column, boolean isVip, boolean isOccupied, boolean isDamaged, double chairPrice, double vipChairPrice) {
        this.hall = hall;
        this.row = row;
        this.column = column;
        this.isVip = isVip;
        this.isOccupied = isOccupied;
        this.isDamaged = isDamaged;
        this.chairPrice = chairPrice;
        this.vipChairPrice = vipChairPrice;
    }
}
