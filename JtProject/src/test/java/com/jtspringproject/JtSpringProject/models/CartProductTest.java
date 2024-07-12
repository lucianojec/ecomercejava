package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartProductTest {

    @Test
    void testGettersAndSetters() {
        CartProduct cartProduct = new CartProduct();

        // Test ID
        cartProduct.setId(1);
        assertEquals(1, cartProduct.getId());

        // Test Cart
        Cart cart = new Cart();
        cart.setId(1);
        cartProduct.setCart(cart);
        assertEquals(cart, cartProduct.getCart());

        // Test Product
        Product product = new Product();
        product.setId(1);
        cartProduct.setProduct(product);
        assertEquals(product, cartProduct.getProduct());
    }

    @Test
    void testConstructor() {
        Cart cart = new Cart();
        cart.setId(1);
        Product product = new Product();
        product.setId(1);

        CartProduct cartProduct = new CartProduct(cart, product);

        assertEquals(cart, cartProduct.getCart());
        assertEquals(product, cartProduct.getProduct());
    }

    @Test
    void testCartAssociation() {
        CartProduct cartProduct = new CartProduct();
        Cart cart = new Cart();
        cart.setId(1);

        cartProduct.setCart(cart);

        assertEquals(1, cartProduct.getCart().getId());
        assertEquals(cart, cartProduct.getCart());
    }

    @Test
    void testProductAssociation() {
        CartProduct cartProduct = new CartProduct();
        Product product = new Product();
        product.setId(1);

        cartProduct.setProduct(product);

        assertEquals(1, cartProduct.getProduct().getId());
        assertEquals(product, cartProduct.getProduct());
    }
}
