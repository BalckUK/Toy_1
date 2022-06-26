package com.example.demo.service;

import com.example.demo.user.repository.UserRepository;
import com.example.demo.user.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceTest {
    private static UserRepository userRepository;
    private static  UserService userService;

    @BeforeAll
    static void beforeAll(){
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @Test
    void userName() {
        when(userRepository.FindById(10)).thenReturn("aaa");
        String userName = userService.UserName();
        assertEquals("aaa",userName);

    }
}