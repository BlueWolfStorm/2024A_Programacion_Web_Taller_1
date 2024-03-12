package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
public class Function {

    private MovieFunction movieFunction;
    private Hall hall;
    private String startTime;
    private String endTime;
    private float cost;

}
