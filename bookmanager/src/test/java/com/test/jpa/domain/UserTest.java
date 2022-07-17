package com.test.jpa.domain;

import com.test.jpa.bookmanager.domain.User;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void test (){
        User user = new User();
        user.setEmail("test@naver.com");
        user.setName("martin");
        
        System.out.println(">>> " + user.toString());
        
    }
}
