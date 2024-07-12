package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void testGettersAndSetters() {
        Cart cart = new Cart();

        // Test ID
        cart.setId(1);
        assertEquals(1, cart.getId());

        // Test Customer
        User customer = new User();
        customer.setId(1);
        cart.setCustomer(customer);
        assertEquals(customer, cart.getCustomer());
    }

    @Test
    void testCustomerAssociation() {
        Cart cart = new Cart();
        User customer = new User();
        customer.setId(1);

        cart.setCustomer(customer);

        assertEquals(1, cart.getCustomer().getId());
        assertEquals(customer, cart.getCustomer());
    }

    // Add more tests as necessary, especially if you have custom logic in the Cart class
}
