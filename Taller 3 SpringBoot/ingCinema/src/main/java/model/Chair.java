package model;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor

public class Chair {

    private String row;
    private String column;
    private boolean available;
    private String status;
    private Hall hall;

    @Override
    public String toString() {
        return "Chair{" +
                "row='" + row + '\'' +
                ", column='" + column + '\'' +
                ", available=" + available +
                ", status='" + status + '\'' +
                ", hall=" + hall +
                '}';
    }
}
