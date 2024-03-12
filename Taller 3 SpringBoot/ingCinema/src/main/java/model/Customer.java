package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Customer {

    private User user;
    private String creditCard;

    @Override
    public String toString() {
        return "Customer{" +
                ", user=" + user +
                ", creditCard='" + creditCard + '\'' +
                '}';
    }
}
