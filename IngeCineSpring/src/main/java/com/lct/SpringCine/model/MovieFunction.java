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
    private Movie movie;
    private LocalDate startDate, finishDate;

    private List<FunctionHallSchedule> scheduleList;

    public MovieFunction(Movie movie, LocalDate startDate, LocalDate finishDate, List<FunctionHallSchedule> scheduleList) {
        this.movie = movie;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.scheduleList = scheduleList;
    }
}
