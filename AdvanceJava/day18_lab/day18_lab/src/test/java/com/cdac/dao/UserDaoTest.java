package com.cdac.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cdac.entities.FoodItem;
import com.cdac.entities.User;
import com.cdac.service.FoodItemService;

@DataJpaTest // Tells Spring Boot this is a DAO-layer test
@AutoConfigureTestDatabase(replace = Replace.NONE) // Use real DB, not in-memory
class UserDaoTest {

    @Autowired
    private UserDao usersDao; // Autowired field (not inside the method)

    @Test
    void testFindByEmailAndPassword() {
        Optional<User> optional = usersDao.findByEmailAndPassword("a1@gmail.com", "12345");
        assertTrue(optional.isPresent(), "User should exist with given email and password");
    }
    
   
    }        