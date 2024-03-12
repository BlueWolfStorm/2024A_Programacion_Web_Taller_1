package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString

public class ComboCart {
    private Cart cart;
    private Combo combo;
    private int amount;
    private float price;
}
