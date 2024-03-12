package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString

public class Ticket {

    private Function function;
    private Customer customer;
    private float cost;
    private Chair HallChair;
    private Cart cart;
    private LocalDateTime usageDate;
    private LocalDateTime creationDate;

}


