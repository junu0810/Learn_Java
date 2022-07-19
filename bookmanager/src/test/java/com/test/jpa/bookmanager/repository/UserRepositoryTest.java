package com.test.jpa.bookmanager.repository;

import com.test.jpa.bookmanager.domain.UserTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {
    
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { 
        // @NoArgsConstructor덕분에 요소없이 객체 생성 가능
        userRepository.save(new UserTable());

        System.out.println(">>> " + userRepository.findAll());
        
    }
}

