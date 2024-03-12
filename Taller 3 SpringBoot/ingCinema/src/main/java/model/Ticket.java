package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Ticket {

    private Function function;
    private Customer customer;
    private float cost;
    private Chair chair;

    @Override
    public String toString() {
        return "Ticket{" +
                "function=" + function +
                ", customer=" + customer +
                ", cost=" + cost +
                ", chair=" + chair +
                '}';
    }
}


