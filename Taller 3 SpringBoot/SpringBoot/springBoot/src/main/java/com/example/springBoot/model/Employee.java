package com.example.springBoot.model;

import java.util.Date;

public class Employee {
    User user;
    String position;
    Date startDate;
    Date endDate;
    float salary;


    public Employee() {
    }

    public Employee(User user, String position, Date startDate, Date endDate, float salary) {
        this.user = user;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
        this.salary = salary;
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
                "user=" + user +
                ", position='" + position + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", salary=" + salary +
                '}';
    }

}
