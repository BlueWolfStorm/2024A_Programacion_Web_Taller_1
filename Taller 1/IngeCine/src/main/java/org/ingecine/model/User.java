package org.ingecine.model;

import java.time.LocalDate;

public class User {
    protected int id;
    protected boolean disableStatus, vipStatus;
    protected String name, address, email, phone, billingInfo;
    protected LocalDate creationDate;

    public User(){}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisableStatus() {
        return disableStatus;
    }

    public void setDisableStatus(boolean disableStatus) {
        this.disableStatus = disableStatus;
    }

    public boolean isVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(boolean vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(String billingInfo) {
        this.billingInfo = billingInfo;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
