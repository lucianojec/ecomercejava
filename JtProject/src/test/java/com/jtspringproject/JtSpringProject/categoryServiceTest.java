package com.jtspringproject.JtSpringProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jtspringproject.JtSpringProject.models.Category;



class categoryServiceTest {

    @Mock
    private com.jtspringproject.JtSpringProject.dao.categoryDao categoryDao;

    @InjectMocks
    private com.jtspringproject.JtSpringProject.services.categoryService categoryService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addCategory() {
        String name = "New Category";
        Category category = new Category(); // Suponha que tenha um construtor adequado
        when(categoryDao.addCategory(name)).thenReturn(category);

        Category result = categoryService.addCategory(name);

        assertEquals(category, result);
        verify(categoryDao, times(1)).addCategory(name);
    }

    @Test
    void getCategories() {
        List<Category> categories = Arrays.asList(new Category(), new Category());
        when(categoryDao.getCategories()).thenReturn(categories);

        List<Category> result = categoryService.getCategories();

        assertEquals(categories, result);
        verify(categoryDao, times(1)).getCategories();
    }

    @Test
    void deleteCategory() {
        int id = 1;
        when(categoryDao.deletCategory(id)).thenReturn(true);

        Boolean result = categoryService.deleteCategory(id);

        assertTrue(result);
        verify(categoryDao, times(1)).deletCategory(id);
    }

    @Test
    void updateCategory() {
        int id = 1;
        String name = "Updated Category";
        Category category = new Category(); // Suponha que tenha um construtor adequado
        when(categoryDao.updateCategory(id, name)).thenReturn(category);

        Category result = categoryService.updateCategory(id, name);

        assertEquals(category, result);
        verify(categoryDao, times(1)).updateCategory(id, name);
    }

    @Test
    void getCategory() {
        int id = 1;
        Category category = new Category(); // Suponha que tenha um construtor adequado
        when(categoryDao.getCategory(id)).thenReturn(category);

        Category result = categoryService.getCategory(id);

        assertEquals(category, result);
        verify(categoryDao, times(1)).getCategory(id);
    }
    
}
