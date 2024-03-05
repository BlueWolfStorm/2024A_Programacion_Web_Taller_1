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
    private int id;
    private MovieFunction movieFunction;
    private Hall hall;
    private LocalDate startDate, finishDate;
    private List<Hours> hoursList;

    public FunctionHallSchedule(int id, MovieFunction movieFunction, Hall hall, LocalDate startDate, LocalDate finishDate, List<Hours> hoursList) {
        this.id = id;
        this.movieFunction = movieFunction;
        this.hall = hall;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.hoursList = hoursList;
    }

}
