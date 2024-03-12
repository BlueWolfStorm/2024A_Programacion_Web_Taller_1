package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString

public class MovieFunction {

    private Movie movie;
    private LocalDate starDate;
    private LocalDate endDate;
    private List<Function> functionsHallSchedule = new ArrayList<Function>();
}
