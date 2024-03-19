package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class Hours {
    private LocalTime startHour, finishHour;

    public Hours(int id, LocalTime startHour, LocalTime finishHour) {
        this.startHour = startHour;
        this.finishHour = finishHour;
    }

}
