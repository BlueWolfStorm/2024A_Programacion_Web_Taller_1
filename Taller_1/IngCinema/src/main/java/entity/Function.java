/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.security.Timestamp;

/**
 *
 * @author srroj
 */
public class Function {
    private int id;    
    private Hall hall;
    private Movie movie;
    private Timestamp starTime;
    private Timestamp endTime;
    private float cost;

    public Function() {
    }

    public Function(int id, Hall hall, Movie movie, Timestamp starTime, Timestamp endTime, float cost) {
        this.id = id;
        this.hall = hall;
        this.movie = movie;
        this.starTime = starTime;
        this.endTime = endTime;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Timestamp getStarTime() {
        return starTime;
    }

    public void setStarTime(Timestamp starTime) {
        this.starTime = starTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Function{" + "id=" + id + ", hall=" + hall + ", movie=" + movie + ", starTime=" + starTime + ", endTime=" + endTime + ", cost=" + cost + '}';
    }
    
    
    
}
