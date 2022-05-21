package com.example.FoodMap.components.users;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.function.IntToLongFunction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.example.FoodMap.componets.users.usersRepository;
import com.example.FoodMap.componets.users.usersService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.UserRequestPostProcessor;

public class usersServiceTest {

    /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.example.FoodMap.components.users.users");
    EntityManager em = emf.createEntityManager();*/
    
    @Mock
    private usersRepository usersRepository;
    private AutoCloseable autoCloseable;
    
    private usersService underTest;

    @BeforeEach
    void setUp(){
        autoCloseable =  MockitoAnnotations.openMocks(this);
        underTest = new usersService(usersRepository);
    }

    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    /*@Test
    public void givenIdentityStrategy_whenCommitTransction_thenReturnPrimaryKey() {
        users u2 = new users();
        u2.setAvalability(1);
        u2.setEmail("email");
        u2.setUser_name("user_name");
            
        em.getTransaction().begin();
        em.persist(u2);
        //Assert.assertNull(u2.getId());
        em.getTransaction().commit();

        Long expectPrimaryKey = 1L;
        //Assert.assertEquals(expectPrimaryKey, u2.getId());
        System.out.println(u2.getId());
    }

    
    /*@Test
    void testCreateUserValid() {
        // given
        users u = new users("hmm@email.com", "user1", 1);
        users u2 = new users();
        u2.setAvalability(1);
        u2.setEmail("email");
        u2.setUser_name("user_name");

        // when
        underTest.createUser(u);
        // then
        ArgumentCaptor<users> userArgumentCaptor = ArgumentCaptor.forClass(users.class);
        verify(usersRepository).save(userArgumentCaptor.capture());

        users capturedUser = userArgumentCaptor.getValue();
        System.out.println(capturedUser.getId());
        System.out.println(u2.getId());
        assertEquals(u, capturedUser);
    }*/


    @Test
    void testCreateUserInvalid() {
        // given
        // when
        // then
    }

    @Test
    @Disabled
    void testGetUser() {

    }
}
