package org.ingecine.model;

import java.time.LocalDate;
import java.util.List;

public class FunctionHallSchedule {
    private int id;
    private MovieFunction movieFunction;
    private Hall hall;
    private LocalDate startDate, finishDate;
    private List<Hours> hoursList;

    public FunctionHallSchedule(){}

    public FunctionHallSchedule(int id, MovieFunction movieFunction, Hall hall, LocalDate startDate, LocalDate finishDate, List<Hours> hoursList) {
        this.id = id;
        this.movieFunction = movieFunction;
        this.hall = hall;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.hoursList = hoursList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MovieFunction getMovieFunction() {
        return movieFunction;
    }

    public void setMovieFunction(MovieFunction movieFunction) {
        this.movieFunction = movieFunction;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public List<Hours> getHoursList() {
        return hoursList;
    }

    public void setHoursList(List<Hours> hoursList) {
        this.hoursList = hoursList;
    }
}
