package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class User {
    protected int id;
    protected boolean disableStatus, vipStatus;
    protected String name, address, email, phone, billingInfo;
    protected LocalDate creationDate;

    public User(int id, boolean disableStatus, boolean vipStatus, String name, String address, String email, String phone, String billingInfo, LocalDate creationDate) {
        this.id = id;
        this.disableStatus = disableStatus;
        this.vipStatus = vipStatus;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.billingInfo = billingInfo;
        this.creationDate = creationDate;
    }
}
