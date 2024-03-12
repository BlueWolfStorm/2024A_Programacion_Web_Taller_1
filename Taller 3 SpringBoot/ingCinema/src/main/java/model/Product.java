package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.ToString
public class Product {

    private String name;
    private double price;
    private String description;
    private int stock;
    private int porcentageDiscount;
    private boolean isDiscount;
    private int amount;


}
