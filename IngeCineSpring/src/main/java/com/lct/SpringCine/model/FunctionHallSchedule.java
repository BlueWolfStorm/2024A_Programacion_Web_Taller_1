package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FunctionHallSchedule {
    private MovieFunction movieFunction;
    private Hall hall;
    private LocalDate startDate, finishDate;
    private List<Hours> hoursList;

    public FunctionHallSchedule(MovieFunction movieFunction, Hall hall, LocalDate startDate, LocalDate finishDate, List<Hours> hoursList) {
        this.movieFunction = movieFunction;
        this.hall = hall;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.hoursList = hoursList;
    }

}
