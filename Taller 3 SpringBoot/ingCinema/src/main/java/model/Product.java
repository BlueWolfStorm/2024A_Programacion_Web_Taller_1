package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Product {

    private String name;
    private double price;
    private String description;
    private int stock;
    private int porcentageDiscount;
    private boolean isDiscount;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", porcentageDiscount=" + porcentageDiscount +
                ", isDiscount=" + isDiscount +
                '}';
    }
}
