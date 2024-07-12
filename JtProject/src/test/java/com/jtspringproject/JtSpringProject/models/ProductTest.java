package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testGettersAndSetters() {
        Product product = new Product();

        // Test ID
        product.setId(1);
        assertEquals(1, product.getId());

        // Test Name
        String name = "Laptop";
        product.setName(name);
        assertEquals(name, product.getName());

        // Test Image
        String image = "laptop.jpg";
        product.setImage(image);
        assertEquals(image, product.getImage());

        // Test Category
        Category category = new Category();
        category.setId(1);
        product.setCategory(category);
        assertEquals(category, product.getCategory());

        // Test Quantity
        int quantity = 10;
        product.setQuantity(quantity);
        assertEquals(quantity, product.getQuantity());

        // Test Price
        int price = 1000;
        product.setPrice(price);
        assertEquals(price, product.getPrice());

        // Test Weight
        int weight = 5;
        product.setWeight(weight);
        assertEquals(weight, product.getWeight());

        // Test Description
        String description = "A high-performance laptop";
        product.setDescription(description);
        assertEquals(description, product.getDescription());

    }

    @Test
    void testCategoryAssociation() {
        Product product = new Product();
        Category category = new Category();
        category.setId(1);

        product.setCategory(category);

        assertEquals(1, product.getCategory().getId());
        assertEquals(category, product.getCategory());
    }

}
