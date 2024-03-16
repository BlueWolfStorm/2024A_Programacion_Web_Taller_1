package com.app.Controller;
import java.util.HashMap;
import java.util.Map;

import com.app.Model.Customer;
public class ClientVIPController {
    // Map para almacenar los clientes VIP y sus descuentos
    private Map<Customer, Double> discountsVIP = new HashMap<>();

    // Método para asignar descuentos a clientes VIP
    public void assignVIPDiscount(Customer customer, double discount) {
        discountsVIP.put(customer, discount);
    }

    // Método para consultar el descuento de un cliente VIP
    public Double consultDiscountVIP(Customer customer) {
        return discountsVIP.get(customer);
    }

    public boolean Check(Customer customer) {
        // Verificar si el cliente está en la lista de clientes VIP
        return discountsVIP.containsKey(customer);
    }
}
