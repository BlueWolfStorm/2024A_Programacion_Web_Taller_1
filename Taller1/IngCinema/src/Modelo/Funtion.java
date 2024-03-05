/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author PC
 */
public class Funtion {
    
    String funtionId;
    Movie movie;
    Hall hall;
    LocalDateTime starTime;
    LocalDateTime finishTime;

    public String getFuntionId() {
        return funtionId;
    }

    public void setFuntionId(String funtionId) {
        this.funtionId = funtionId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public LocalDateTime getStarTime() {
        return starTime;
    }

    public void setStarTime(LocalDateTime starTime) {
        this.starTime = starTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public Funtion(String funtionId, Movie movie, Hall hall, LocalDateTime starTime, LocalDateTime finishTime) {
        this.funtionId = funtionId;
        this.movie = movie;
        this.hall = hall;
        this.starTime = starTime;
        this.finishTime = finishTime;
    }
    
    
    
}
