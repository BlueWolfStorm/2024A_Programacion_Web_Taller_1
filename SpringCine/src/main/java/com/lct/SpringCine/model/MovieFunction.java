package com.lct.SpringCine.model;

import java.time.LocalDate;
import java.util.List;

public class MovieFunction {
    private int id;
    private Movie movie;
    private LocalDate startDate, finishDate;

    private List<FunctionHallSchedule> scheduleList;

    public MovieFunction(){}

    public MovieFunction(int id, Movie movie, LocalDate startDate, LocalDate finishDate, List<FunctionHallSchedule> scheduleList) {
        this.id = id;
        this.movie = movie;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.scheduleList = scheduleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
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

    public List<FunctionHallSchedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<FunctionHallSchedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
}
