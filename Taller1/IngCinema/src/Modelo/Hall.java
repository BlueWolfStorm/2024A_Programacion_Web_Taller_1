/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PC
 */
public class Hall {
    String romId;
    int rowNumber;
    int seatsPerRow;

    public String getRomId() {
        return romId;
    }

    public void setRomId(String romId) {
        this.romId = romId;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }

    public Hall(String romId, int rowNumber, int seatsPerRow) {
        this.romId = romId;
        this.rowNumber = rowNumber;
        this.seatsPerRow = seatsPerRow;
    }
    
    
    
}
