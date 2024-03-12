package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

public class Function {

    private Movie movie;
    private Hall hall;
    private String startTime;
    private String endTime;
    private float cost;

    @Override
    public String toString() {
        return "Function{" +
                "movie=" + movie +
                ", hall=" + hall +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", cost=" + cost +
                '}';
    }
}
