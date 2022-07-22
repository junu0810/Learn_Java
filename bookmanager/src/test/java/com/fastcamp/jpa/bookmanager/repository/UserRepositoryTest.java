package com.fastcamp.jpa.bookmanager.repository;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

import java.util.List;

import javax.transaction.Transactional;

import com.fastcamp.jpa.bookmanager.domain.UserTable;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Transactional
class UserRepositoryTest {

   @Autowired
   private UserRepository userRepository;

   @Test
   void crud() {
       // // @NoArgsConstructor덕분에 요소없이 객체 생성 가능 argument를 넣으면 그 데이터로 생성됨
       userRepository.save(new UserTable());

       // // System.out.println(">>> " + userRepository.findAll());
       userRepository.findAll().forEach(System.out::println);

       // ------------------------------------------------------//
       // 이름내림차순으로 정렬
       List<UserTable> users = userRepository.findAll(Sort.by(Direction.DESC,"name"));
       users.forEach(System.out::println);

       // ------------------------------------------------------//
       //새로운값을 넣어서 저장할 경우
       UserTable user1 = new UserTable("jack", "jack@naver.com");
       UserTable user2 = new UserTable("steve","steve@daum.net");

       userRepository.saveAll(Lists.newArrayList(user1,user2));

       List<UserTable> users1 = userRepository.findAll();
       users1.forEach(System.out::println);

       // ------------------------------------------------------//
       // ID값으로 원하는 칼럼 호출
       UserTable getuser = userRepository.getById(1L);
       System.out.println(getuser);

       // ------------------------------------------------------//
       // DB반영시점을 건드리는 flush를 사용한다.
       userRepository.saveAndFlush(new UserTable("new User" , "test@daum.net"));
       userRepository.findAll().forEach(System.out::println);

       // ------------------------------------------------------//
       // Count를 통한 컬럼 갯수 확인 Long혀익으로 리턴함
       long count = userRepository.count();
       System.out.println(count);

       // ------------------------------------------------------//
       // 값의 유무 판별을 시행함 boolean값을 리턴함

       boolean exist = userRepository.existsById(1L);
       System.out.println(exist);

       // ------------------------------------------------------//
       // delete 기능 orElseThrow를 통한 예외처리도 가능
       userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
       userRepository.findAll().forEach(System.out::println);
       // 전체삭제일경우 deleteAll()을 사용한다.
       // deleteAll()에 argument를 넣을경우 여러개의 데이터를 지울 수 있다.
       // userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
       // delete쿼리랑 deleteAllInBatch는 delete쿼리가 돌기전 select쿼라의 유무이다(Batch는 없음)

       // ------------------------------------------------------//
       // 페이징 기능 활용하기
       Page<UserTable> userPage = userRepository.findAll(PageRequest.of(1,5));
       System.out.println(userPage);

       System.out.println("page = " + userPage);
       System.out.println("totalElementpage = " + userPage.getTotalElements());
       System.out.println("totalpages = " + userPage.getTotalPages());
       System.out.println("numberOfElement = " + userPage.getNumberOfElements());
       System.out.println("sort = " + userPage.getSort());
       System.out.println("size = " + userPage.getSize());

       userPage.getContent().forEach(System.out::println);

       // ------------------------------------------------------//
       // Entity를 활용한 메서드
       ExampleMatcher matcher = ExampleMatcher.matching()
           .withIgnorePaths("name")//Name은 비교대상에서 제외
           .withMatcher("email", endsWith()); //email의 끝부분을 검색 query like와 흡사

       Example<UserTable> example = Example.of(new UserTable("ma" , "naver.com"),matcher);

       userRepository.findAll(example);
       // ------------------------------------------------------//


       // ------------------------------------------------------//
       //
   }
}