package com.lct.SpringCine.controller;

import com.lct.SpringCine.model.Cart;

import java.time.LocalDate;
import java.util.List;

public class UserController {
    public boolean login(String email, String password){
        //TODO: This function should validate if the user and password are valid.
        return false;
    }

    public boolean register(boolean vipStatus, String name, String address, String email, String phone, String billingInfo){
        //TODO: This function should create a new user and add it to the database.
        return false;
    }

    public boolean addCart(Cart cart){
        //TODO: This function should add a cart to the database.
        return false;
    }

    public boolean removeCart(Cart cart){
        //TODO: This function should remove a cart from the database.
        return false;
    }

    public boolean updateCart(Cart cart){
        //TODO: This function should update a cart in the database.
        return false;
    }

    public List<Cart> getCarts(){
        //TODO: This function should return all the carts from the database.
        return null;
    }
}
