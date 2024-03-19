package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class User {
    protected boolean disableStatus, vipStatus;
    protected String name, address, email, phone, billingInfo;
    protected LocalDate creationDate;
    protected List<Cart> cartList;

    public User(boolean disableStatus, boolean vipStatus, String name, String address, String email, String phone, String billingInfo, LocalDate creationDate, List<Cart> cartList) {
        this.disableStatus = disableStatus;
        this.vipStatus = vipStatus;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.billingInfo = billingInfo;
        this.creationDate = creationDate;
        this.cartList = cartList;
    }
}
