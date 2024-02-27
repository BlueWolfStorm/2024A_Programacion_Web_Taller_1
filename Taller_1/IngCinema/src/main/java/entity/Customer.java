/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author srroj
 */
public class Customer {
    
    private User user;

    public Customer(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    

    public Customer() {
    }
    
    public void viewAvailableChairs(){
    
    }
    public void addCombos(){
    
    }
    public void buyTicked(){
    
    }
    
    @Override
    public String toString() {
        return "Customer{" + '}';
    }
    
    
    
}
