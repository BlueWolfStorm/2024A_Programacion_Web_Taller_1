package model;

import java.util.ArrayList;
import java.util.List;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Hall {
    private int number;
    private List<Chair> chairs ;

    @Override
    public String toString() {
        return "Hall{" +
                "number=" + number +
                ", chairs=" + chairs +
                '}';
    }
}
