package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class Hours {
    private int id;
    private LocalTime startHour, finishHour;

    public Hours(int id, LocalTime startHour, LocalTime finishHour) {
        this.id = id;
        this.startHour = startHour;
        this.finishHour = finishHour;
    }

}
