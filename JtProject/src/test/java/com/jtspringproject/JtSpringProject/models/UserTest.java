package com.jtspringproject.JtSpringProject.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testGettersAndSetters() {
        User user = new User();

        // Test ID
        user.setId(1);
        assertEquals(1, user.getId());

        // Test Username
        String username = "testUser";
        user.setUsername(username);
        assertEquals(username, user.getUsername());

        // Test Email
        String email = "testUser@example.com";
        user.setEmail(email);
        assertEquals(email, user.getEmail());

        // Test Password
        String password = "password123";
        user.setPassword(password);
        assertEquals(password, user.getPassword());

        // Test Role
        String role = "ADMIN";
        user.setRole(role);
        assertEquals(role, user.getRole());

        // Test Address
        String address = "123 Main St";
        user.setAddress(address);
        assertEquals(address, user.getAddress());
    }
}
