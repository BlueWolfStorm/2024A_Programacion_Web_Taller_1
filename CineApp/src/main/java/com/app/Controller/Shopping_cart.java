package com.app.Controller;
import com.app.Model.ItemCart;
import com.app.Model.Product;
import com.app.Model.Customer;
import com.app.Model.Ticket;

import java.util.ArrayList;
import java.util.List;
public class Shopping_cart {
    private List<ItemCart> items;
    private  ClientVIPController  clientVIPController;
    public Shopping_cart() {
        this.items = new ArrayList<>();
        this.clientVIPController = new ClientVIPController();

    }

    public void addItem(Ticket ticket, Product product, int quantity) {
        // Lógica para agregar un boleto y/o producto al carrito
    }

    public void eliminarItem(Ticket ticket, Product product, int quantity) {
        // Lógica para eliminar un boleto y/o producto del carrito
    }
    public   List<ItemCart> getItem(){
        return  items;
    }



    public double calcularTotal(Customer customer) {
        double total = 0;
        // Lógica para calcular el total de la compra
        // Verificar si el cliente es VIP y aplicar descuento
        if (clientVIPController.Check(customer)){
            // Logica de aplicaion del descuento
        }
        return total;
    }
}
