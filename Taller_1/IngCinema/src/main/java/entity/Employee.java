/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
 import entity.User;
/**
 *
 * @author srroj
 */
public class Employee {
    
    private String position;
    private User user;

    public Employee(String position, User user) {
        this.position = position;
        this.user = user;
    }
    
    

    public Employee() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public void billboardManagement(){
    
    }
    
    public void functionManagement(){
   
    }
    
    public void hallManagement(){
    
    }
    
    public void chairManagement(){
    
    }
    
    public void comboManagement(){
    
    }

    @Override
    public String toString() {
        return "Employee{" + "position=" + position + ", user=" + user + '}';
    }
    
    
}
