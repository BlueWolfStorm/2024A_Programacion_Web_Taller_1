package model;

import java.util.ArrayList;
import java.util.List;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Combo {

    private List<Product> products = new ArrayList<Product>();
    private double price;
    private String name;

    @Override
    public String toString() {
        return "Combo{" +
                "products=" + products +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
