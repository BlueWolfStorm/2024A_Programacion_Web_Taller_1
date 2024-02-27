/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author srroj
 */
public class Ticket {
    
    private int id;
    private Function function;
    private Combo combo;
    private Customer customer;

    public Ticket() {
    }

    public Ticket(int id, Function function, Combo combo, Customer customer) {
        this.id = id;
        this.function = function;
        this.combo = combo;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void generateTicket(){
    
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", function=" + function + ", combo=" + combo + ", customer=" + customer + '}';
    }
    
    
    
    
}
