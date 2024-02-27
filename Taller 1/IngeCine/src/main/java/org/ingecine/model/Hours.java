package org.ingecine.model;

import java.time.LocalTime;

public class Hours {
    private int id;
    private LocalTime startHour, finishHour;

    public Hours(){}

    public Hours(int id, LocalTime startHour, LocalTime finishHour) {
        this.id = id;
        this.startHour = startHour;
        this.finishHour = finishHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }

    public LocalTime getFinishHour() {
        return finishHour;
    }

    public void setFinishHour(LocalTime finishHour) {
        this.finishHour = finishHour;
    }
}
