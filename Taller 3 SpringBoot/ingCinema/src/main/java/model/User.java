package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class User {

    private boolean disableStatus;
    private boolean vipStatus;
    private String name;
    private String address;
    private String phone;
    private String billingInfo;
    private Date creatioDate;
    private String email;
    private String password;
    private List<Cart> carts = new ArrayList<Cart>();

    @Override
    public String toString() {
        return "User{" +
                "disableStatus=" + disableStatus +
                ", vipStatus=" + vipStatus +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", billingInfo='" + billingInfo + '\'' +
                ", creatioDate=" + creatioDate +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", carts=" + carts +
                '}';
    }

}

