package com.example.springBoot.model;

import java.util.Date;

public class Employee extends User{

    String position;
    Date startDate;
    Date endDate;
    float salary;



    public Employee( String name, String lastName, String document, String email, String password, String position, Date startDate, Date endDate, float salary) {
        super(name, lastName, document, email, password);
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                ", position='" + position + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", salary=" + salary +
                '}';
    }

}
