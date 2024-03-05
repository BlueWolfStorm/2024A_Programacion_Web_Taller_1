package com.example.springBoot.model;

public class Hall {
    int id;
    int number;
    Chair chair;

    public Hall() {
    }

    public Hall(int id, int number, Chair chair) {
        this.id = id;
        this.number = number;
        this.chair = chair;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Hall{" + "id=" + id + ", number=" + number + ", chair=" + chair + '}';
    }

}
