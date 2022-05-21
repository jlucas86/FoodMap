package com.example.FoodMap.components.users;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.FoodMap.componets.users.users;
import com.example.FoodMap.componets.users.usersRepository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class usersRepositoryTest {

    @Autowired
    private usersRepository underTest;

    @AfterEach
    void tearDown(){
        underTest.deleteAll();
    }


    @Test
    void testFindUsersByEmail() {
        //given
        
        users u = new users();
        u.setAvalability(0);
        u.setEmail("me@gmail.com");
        u.setUser_name("hot_mom");
        u.setPassword("password");
        u.setRole("reviwer");

        underTest.save(u); 
        
        //when
        users ex =  underTest.findUsersByEmail(u.getEmail());
        //then
        assertEquals(ex, u); 
    }

    @Test
    void testGetUser() {

    }

    @Test
    void testGetUserEmail() {

    }
}
