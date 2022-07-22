package com.fastcamp.jpa.bookmanager.domain;

import java.time.LocalDateTime;

import com.fastcamp.jpa.bookmanager.domain.UserTable;

import org.junit.jupiter.api.Test;


public class UserTest {
    @Test
    void test (){
        UserTable user = new UserTable("test1", "test@naver.com");
        user.setEmail("test@naver.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        
        UserTable user1 = new UserTable(null, "martin", "martin@fastcampus.com", LocalDateTime.now(), LocalDateTime.now());
        UserTable user2 = new UserTable("martin", "martin@fastcampus.com");

        UserTable user3 = UserTable.builder()
            .name("joon")
            .email("test2@daum.net")
            .build();

        // @Builder 테스트를 만들때 자주사용되는 코드로 객체를 생성하고 필드값을 Builder의 형식으로 선언함
          // EX) User.builder().name("baek").email("test@daum.net").build(); 로 객체를 생성 할 수 있다.
        
    }
}
