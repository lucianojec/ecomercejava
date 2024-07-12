package com.jtspringproject.JtSpringProject.services;

import com.jtspringproject.JtSpringProject.dao.userDao;
import com.jtspringproject.JtSpringProject.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class userServiceTest {

    @Mock
    private userDao userDao;

    @InjectMocks
    private com.jtspringproject.JtSpringProject.services.userService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getUsers() {
        List<User> users = Arrays.asList(new User(), new User());
        when(userDao.getAllUser()).thenReturn(users);

        List<User> result = userService.getUsers();

        assertEquals(users, result);
        verify(userDao, times(1)).getAllUser();
    }

    @Test
    void addUser() {
        User user = new User();
        when(userDao.saveUser(user)).thenReturn(user);

        User result = userService.addUser(user);

        assertEquals(user, result);
        verify(userDao, times(1)).saveUser(user);
    }

    @Test
    void checkLogin() {
        String username = "testUser";
        String password = "testPass";
        User user = new User();
        when(userDao.getUser(username, password)).thenReturn(user);

        User result = userService.checkLogin(username, password);

        assertEquals(user, result);
        verify(userDao, times(1)).getUser(username, password);
    }

    @Test
    void checkUserExists() {
        String username = "testUser";
        when(userDao.userExists(username)).thenReturn(true);

        boolean result = userService.checkUserExists(username);

        assertTrue(result);
        verify(userDao, times(1)).userExists(username);
    }
}
