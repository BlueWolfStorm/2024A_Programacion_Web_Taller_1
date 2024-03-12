package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString

public class ProductCart {
    private Cart cart;
    private Product product;
    private int amount;
    private float price;

}
