package com.cdac.dao;

import static org.assertj.core.api.Assertions.fail;
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


    @SpringBootTest
    @DataJpaTest
   @AutoConfigureTestDatabase(replace=Replace.NONE)
    class FoodItemServiceTest {
@Autowired
        private FoodItemDao foodItemDao;

       

        @Test
       void testFindByMyRestrauntName() {
        	List<FoodItem>list = foodItemDao
        			.findByMyRestaurantName("Tandoor Junction");
        	list.forEach(System.out::println);
        	assertEquals( 2,list.size());
        	
        }
        
        @Test
        void testFindByMyRestrauntIdAndIsVegTrue()
        {      // List	<foodItemDao> list = foodItemDao
//        		.findByMyRestaurantName("Tandoor Junction");
//    	list.forEach(System.out::println);
//    	assertEquals( 2,list.size());
//        }
    }     }   