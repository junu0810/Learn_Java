package com.test.jpa.bookmanager.repository;

import com.test.jpa.bookmanager.domain.UserTable;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository <User, Long> 의 처음값은 Entity타입이며 두번째는 PK를 입력함
public interface UserRepository extends JpaRepository<UserTable, Long> {
}
 