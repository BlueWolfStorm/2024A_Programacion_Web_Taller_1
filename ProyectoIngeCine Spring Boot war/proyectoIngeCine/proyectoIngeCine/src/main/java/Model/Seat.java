/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Seat {
    String sealtd;
    String row;
    int number;
    boolean preferencial;
    boolean available;

    public String getSealtd() {
        return sealtd;
    }

    public void setSealtd(String sealtd) {
        this.sealtd = sealtd;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Seat(String sealtd, String row, int number, boolean preferencial, boolean available) {
        this.sealtd = sealtd;
        this.row = row;
        this.number = number;
        this.preferencial = preferencial;
        this.available = available;
    }
    
    
}
