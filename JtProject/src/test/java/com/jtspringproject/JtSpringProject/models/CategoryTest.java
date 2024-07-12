package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void testGettersAndSetters() {
        Category category = new Category();

        // Test ID
        category.setId(1);
        assertEquals(1, category.getId());

        // Test Name
        String name = "Electronics";
        category.setName(name);
        assertEquals(name, category.getName());
    }
}
