package com.lct.SpringCine.controller;

import com.lct.SpringCine.model.Cart;
import com.lct.SpringCine.model.ComboCart;
import com.lct.SpringCine.model.ProductCart;
import com.lct.SpringCine.model.Ticket;

import java.util.List;

public class CartController {
   public boolean addTicket(Ticket ticket, Cart cart) {
      // TODO: Add ticket to cart.
       return false;
   }

   public boolean removeTicket(Ticket ticket, Cart cart) {
       // TODO: Remove ticket from cart.
         return false;
   }

   public boolean updateTicket(Ticket oldTicket, Ticket newTicket, Cart cart) {
       // TODO: Update ticket in cart.
       return false;
   }

   public List<Ticket> getTickets(Cart cart) {
       // TODO: Get tickets from cart.
         return null;
   }

    public boolean addProduct(ProductCart product, Cart cart) {
       // TODO: Add product to cart.
         return false;
    }

    public boolean removeProduct(ProductCart product, Cart cart) {
       // TODO: Remove product from cart.
         return false;
    }

    public boolean updateProduct(ProductCart oldProduct, ProductCart newProduct, Cart cart) {
       // TODO: Update product in cart.
         return false;
    }

    public List<ProductCart> getProducts(Cart cart) {
       // TODO: Get products from cart.
         return null;
    }

    public boolean addCombo(ComboCart combo, Cart cart) {
       // TODO: Add combo to cart.
         return false;
    }

    public boolean removeCombo(ComboCart combo, Cart cart) {
       // TODO: Remove combo from cart.
         return false;
    }

    public boolean updateCombo(ComboCart oldCombo, ComboCart newCombo, Cart cart) {
       // TODO: Update combo in cart.
         return false;
    }

    public List<ComboCart> getCombos(Cart cart) {
       // TODO: Get combos from cart.
         return null;
    }

    public boolean checkout(Cart cart) {
       // TODO: Checkout cart.
         return false;
    }

    public boolean clearCart(Cart cart) {
       // TODO: Clear cart.
         return false;
    }

}
