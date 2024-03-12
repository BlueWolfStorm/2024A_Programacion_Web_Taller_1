package model;

import java.time.LocalDateTime;
import java.util.List;

@lombok.Getter
@lombok.Setter
@lombok.ToString
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class Cart {
    private User user;
    private List<ProductCart> products;
    private List<ComboCart> combos;
    private float totalPrice;
    private List<Ticket> ticket;
    private LocalDateTime creationDate;
}
