package com.lct.SpringCine.controller;

import com.lct.SpringCine.model.Cart;
import com.lct.SpringCine.model.User;

import java.time.LocalDate;
import java.util.List;

public class UserController {
    public User login(String email, String password){
        //TODO: This function should validate if the user and password are valid and it is valid return the User.
        return null;
    }

    public boolean register(boolean vipStatus, String name, String address, String email, String phone, String billingInfo){
        //TODO: Create a new user.
        return false;
    }

    public boolean addCart(Cart cart, User user){
        //TODO:Add a cart to a user.
        return false;
    }

    public boolean removeCart(Cart cart, User user){
        //TODO:Remove a cart from a user.
        return false;
    }

    public boolean updateCart(Cart cart, User user){
        //TODO: Update a cart from a user.
        return false;
    }

    public List<Cart> getCarts(User user){
        //TODO: Return all the carts from a user.
        return null;
    }
}
