package com.jtspringproject.JtSpringProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jtspringproject.JtSpringProject.dao.cartDao;
import com.jtspringproject.JtSpringProject.models.Cart;
import com.jtspringproject.JtSpringProject.services.cartService;

@ExtendWith(MockitoExtension.class)
public class cartServiceTest {
	
    @Mock
    private cartDao cartDao;

    @InjectMocks
    private cartService cartService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    void addCart() {
        Cart cart = new Cart();
        when(cartDao.addCart(cart)).thenReturn(cart);

        Cart result = cartService.addCart(cart);

        assertEquals(cart, result);
        verify(cartDao, times(1)).addCart(cart);
    }
    
    @Test
    void getCarts() {
        List<Cart> carts = Arrays.asList(new Cart(), new Cart());
        when(cartDao.getCarts()).thenReturn(carts);

        List<Cart> result = cartService.getCarts();

        assertEquals(carts, result);
        verify(cartDao, times(1)).getCarts();
    }

    @Test
    void updateCart() {
        Cart cart = new Cart();

        cartService.updateCart(cart);

        verify(cartDao, times(1)).updateCart(cart);
    }
    
    @Test
    void deleteCart() {
        Cart cart = new Cart();

        cartService.deleteCart(cart);

        verify(cartDao, times(1)).deleteCart(cart);
    }
	
}
