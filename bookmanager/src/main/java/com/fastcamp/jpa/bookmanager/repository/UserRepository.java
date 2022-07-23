package com.fastcamp.jpa.bookmanager.repository;

import com.fastcamp.jpa.bookmanager.domain.UserTable;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

//JpaRepository <User, Long> 의 처음값은 Entity타입이며 두번째는 PK를 입력함
public interface UserRepository extends JpaRepository<UserTable, Long> {
    Set<UserTable> findByName(String name);
    UserTable findByEmail(String email);
    UserTable getByEmail(String email);
    UserTable readByEmail(String email);
    UserTable queryByEmail(String email);
    UserTable searchByEmail(String email);
    UserTable streamByEmail(String email);
    UserTable findUserByEmail(String email);
    UserTable findSomethingByEmail(String email);
    List<UserTable> findFirst1ByName(String name);
    List<UserTable> findTop2ByName(String name);

    List<UserTable> findLast2ByName(String name);

}

