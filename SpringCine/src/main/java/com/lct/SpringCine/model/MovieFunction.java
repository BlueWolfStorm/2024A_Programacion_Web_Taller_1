package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MovieFunction {
    private int id;
    private Movie movie;
    private LocalDate startDate, finishDate;

    private List<FunctionHallSchedule> scheduleList;

    public MovieFunction(int id, Movie movie, LocalDate startDate, LocalDate finishDate, List<FunctionHallSchedule> scheduleList) {
        this.id = id;
        this.movie = movie;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.scheduleList = scheduleList;
    }
}
