/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tatan
 */
public class Employee {

    private int id;
    private String name;
    private String lastName;
    private String position;
    private String shift;
    private double salary;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.lastName = "";
        this.position = "";
        this.shift = "";
        this.salary = 0.0;
    }

    public Employee(int id, String name, String lastName, String position, String shift, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.shift = shift;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", lastName='" + lastName + '\''
                + ", position='" + position + '\''
                + ", shift='" + shift + '\''
                + ", salary=" + salary
                + '}';
    }
}
