package com.jtspringproject.JtSpringProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jtspringproject.JtSpringProject.dao.productDao;
import com.jtspringproject.JtSpringProject.models.Product;
import com.jtspringproject.JtSpringProject.services.productService;

class productServiceTest {

    @Mock
    private productDao productDao;

    @InjectMocks
    private productService productService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getProducts() {
        List<Product> products = Arrays.asList(new Product(), new Product());
        when(productDao.getProducts()).thenReturn(products);

        List<Product> result = productService.getProducts();

        assertEquals(products, result);
        verify(productDao, times(1)).getProducts();
    }

    @Test
    void addProduct() {
        Product product = new Product();
        when(productDao.addProduct(product)).thenReturn(product);

        Product result = productService.addProduct(product);

        assertEquals(product, result);
        verify(productDao, times(1)).addProduct(product);
    }

    @Test
    void getProduct() {
        int id = 1;
        Product product = new Product();
        when(productDao.getProduct(id)).thenReturn(product);

        Product result = productService.getProduct(id);

        assertEquals(product, result);
        verify(productDao, times(1)).getProduct(id);
    }

    @Test
    void deleteProduct() {
        int id = 1;
        when(productDao.deletProduct(id)).thenReturn(true);

        boolean result = productService.deleteProduct(id);

        assertTrue(result);
        verify(productDao, times(1)).deletProduct(id);
    }
}
