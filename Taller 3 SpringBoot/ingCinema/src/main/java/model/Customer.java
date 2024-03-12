package model;
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Customer {

    User user;
    String creditCard;
    String address;
    String phone;

    @Override
    public String toString() {
        return "Customer{" +
                ", user=" + user +
                ", creditCard='" + creditCard + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
