package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Receipt {

    private List<Product> products  = new ArrayList<Product>();
    private List<Combo> combos = new ArrayList<Combo>();
    private Customer customer;
    private boolean isDiscount;
    private double discount;
    private double total;
    private LocalDate date;

    @Override
    public String toString() {
        return "Receipt{" +
                "products=" + products +
                ", combos=" + combos +
                ", customer=" + customer +
                ", isDiscount=" + isDiscount +
                ", discount=" + discount +
                ", total=" + total +
                ", date=" + date +
                '}';
    }
}
