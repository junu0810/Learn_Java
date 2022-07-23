package com.fastcamp.jpa.bookmanager.repository;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import com.fastcamp.jpa.bookmanager.domain.UserTable;

import net.bytebuddy.asm.Advice;
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
import org.springframework.test.context.jdbc.Sql;
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
//        // @NoArgsConstructor덕분에 요소없이 객체 생성 가능 argument를 넣으면 그 데이터로 생성됨
//        userRepository.save(new UserTable());
//
//        System.out.println(">>> " + userRepository.findAll());
//        userRepository.findAll().forEach(System.out::println);
//
//        // ------------------------------------------------------//
//        // 이름내림차순으로 정렬
//        List<UserTable> users = userRepository.findAll(Sort.by(Direction.DESC,"name"));
//        users.forEach(System.out::println);
//
//        // ------------------------------------------------------//
//        //새로운값을 넣어서 저장할 경우
//        UserTable user1 = new UserTable("jack", "jack@naver.com");
//        UserTable user2 = new UserTable("steve","steve@daum.net");
//
//        userRepository.saveAll(Lists.newArrayList(user1,user2));
//
//        List<UserTable> users1 = userRepository.findAll();
//        users1.forEach(System.out::println);
//
//        // ------------------------------------------------------//
//        // ID값으로 원하는 칼럼 호출
//        UserTable getuser = userRepository.getById(1L);
//        System.out.println(getuser);
//
//        // ------------------------------------------------------//
//
//        // DB반영시점을 건드리는 flush를 사용한다.
//        userRepository.saveAndFlush(new UserTable("new User" , "test@daum.net"));
//        userRepository.findAll().forEach(System.out::println);
//        // ------------------------------------------------------//
//        // Count를 통한 컬럼 갯수 확인 Long혀익으로 리턴함
//        long count = userRepository.count();
//        System.out.println(count);
//
//        // ------------------------------------------------------//
//        // 값의 유무 판별을 시행함 boolean값을 리턴함
//
//        boolean exist = userRepository.existsById(1L);
//        System.out.println(exist);
//
//        // ------------------------------------------------------//
//        // delete 기능 orElseThrow를 통한 예외처리도 가능
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.findAll().forEach(System.out::println);
//        // 전체삭제일경우 deleteAll()을 사용한다.
//        // deleteAll()에 argument를 넣을경우 여러개의 데이터를 지울 수 있다.
//        // userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        // delete쿼리랑 deleteAllInBatch는 delete쿼리가 돌기전 select쿼라의 유무이다(Batch는 없음)
//
//        // ------------------------------------------------------//
//        // 페이징 기능 활용하기
//        Page<UserTable> userPage = userRepository.findAll(PageRequest.of(1,5));
//        System.out.println(userPage);
//
//        System.out.println("page = " + userPage);
//        System.out.println("totalElementpage = " + userPage.getTotalElements());
//        System.out.println("totalpages = " + userPage.getTotalPages());
//        System.out.println("numberOfElement = " + userPage.getNumberOfElements());
//        System.out.println("sort = " + userPage.getSort());
//        System.out.println("size = " + userPage.getSize());
//
//        userPage.getContent().forEach(System.out::println);
//
//        // ------------------------------------------------------//
//        // Entity를 활용한 메서드
//        ExampleMatcher matcher = ExampleMatcher.matching()
//           .withIgnorePaths("name")//Name은 비교대상에서 제외
//           .withMatcher("email", endsWith()); //email의 끝부분을 검색 query like와 흡사
//
//        Example<UserTable> example = Example.of(new UserTable("ma" , "naver.com"),matcher);
//
//        userRepository.findAll(example);
//        // ------------------------------------------------------//
//        // 해당 아이디를 찾고 데이터 변경 update
        userRepository.save(new UserTable("david", "david@fastcampus.com"));
        UserTable changeuser= userRepository.findById(1L).orElseThrow(RuntimeException::new);
        changeuser.setEmail("martin-updated@fastcampus.com");
        userRepository.save(changeuser);

        System.out.println(changeuser);
//        // ------------------------------------------------------//

   }
   @Test
     void select(){
//       System.out.println(userRepository.findByName("dennis"));
//
//       System.out.println("findByEmail : " + userRepository.findByEmail("martin@fastcampus.com"));
//       System.out.println("getByEmail : " + userRepository.getByEmail("martin@fastcampus.com"));
//       System.out.println("readByEmail : " + userRepository.readByEmail("martin@fastcampus.com"));
//       System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@fastcampus.com"));
//       System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@fastcampus.com"));
//       System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@fastcampus.com"));
//       System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@fastcampus.com"));
//       System.out.println("findSomethingByEmail : " + userRepository.findSomethingByEmail("martin@fastcampus.com"));
//
//       // 이름의 Limit로 쿼리가 실행된다.
//       System.out.println("findFirst1ByName : " + userRepository.findFirst1ByName("martin"));
//       System.out.println("findTop2ByName : " + userRepository.findTop2ByName("martin"));
//       System.out.println("findLast1ByName : " + userRepository.findLast2ByName("martin"));

//       //AND와 OR조건으로 쿼리문 실행하기
//       System.out.println("findByEmailAndName : " + userRepository.
//               findByEmailAndName("martin@fastcampus.com", "martin"));
//       System.out.println("findByEmailOrName : " + userRepository.
//               findByEmailOrName("martin@fastcampus.com","martin"));
//
//       //시간에 대한 조건설정
//       //하루전 이후의 데이터값들을 조회함
//       System.out.println("findByCreatedAtAfter : " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1)));
//
//       //ID를 통해 이후값과 이전값을 찾을 수 도 있다.
//       System.out.println("findByIdAfter : " + userRepository.findByIdAfter(4L));
//
//       //createdAt보다 값이 큰것을 호출한다. (Before, After보다 좀더 범용적으로 사용이 가능하다.)
//       System.out.println("findByCreatedAtGreaterThanAnd : " + userRepository.
//               findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1)));
//
//       //크거나 같은것 즉 이상으로 검색이 된다.(Before과 After는 같은값은 포함하지 않는다.)
//       System.out.println("findByCreatedAtGreaterThanEqual : " + userRepository.
//               findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1)));

       //사이값을 조회하는 Query문 (Between은 입력한 양쪽끝을 값을 포함해서 결과값을 나타냄)
       System.out.println("findByCreatedAtBetween : " + userRepository.
               findByCreatedAtBetween(LocalDateTime.now().minusDays(1) , LocalDateTime.now().plusDays(1)));
       System.out.println("findByIdBetween : " + userRepository.
               findByIdBetween(1L,2L));
       //Between과 아래 쿼리는 동일하게 돌아감
       System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual : " + userRepository.
               findByIdGreaterThanEqualAndIdLessThanEqual(1L,3L));

   }
}