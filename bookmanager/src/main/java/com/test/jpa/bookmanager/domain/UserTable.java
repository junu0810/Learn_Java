package com.test.jpa.bookmanager.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//Lombok라이브러리를 사용하면 코드가 단축 된다.

//@ToString
@NoArgsConstructor //아무런 인자없이 생성하는 생성자에 선언, JAP는 인자가 없는 생성자가 반드시 필요함
@AllArgsConstructor //객체가 가지고 있는 모든 필드들을 인자로 받아 생성토록 하는것 
@RequiredArgsConstructor // 꼭 필요한 인자만을 받아서 생성하는 생성자 @NonNull을 활용해서 선언함
@Data //는 {@cdoe @Getter @Setter @RequiredArgsConstructor @ToString @ EqualsAndHashCode}들을 선언하는것과 동일함
@Builder //테스트를 만들때 자주사용되는 코드로 객체를 생성하고 필드값을 Builder의 형식으로 선언함
// EX) User.builder().name("baek").email("test@daum.net").build(); 로 객체를 생성 할 수 있다.
@Entity(name = "Users") //DB에서의 테이블과 자바 객체간의 연결을 만들어주는데 이때 자바객체라는걸 Entity라고 함 (Entity는 PK가 반드시 필요함)
public class UserTable {

	@Id //PK
	@GeneratedValue //id는 자동으로 증가하는 값
	private Long id; //id라는 숫자는 User라는 테이블의 PK값이 됨

    @NonNull
    private String name;

    @NonNull
    private String email;
    
	private LocalDateTime createdAt;
    
	private LocalDateTime updatedAt;

}
    // @Override
    // public String toString(){
    //     return getClass().getName() 
    //     + " : "
    //     + "name = " + name
    //     + ", email = " + email
    //     + ", createdAt = " + createdAt
    //     + ", updatedAt = " + updatedAt;
    // }
	// public String getName() {
	// 	return this.name;
	// }

	// public void setName(String name) {
	// 	this.name = name;
	// }

	// public String getEmail() {
	// 	return this.email;
	// }

	// public void setEmail(String email) {
	// 	this.email = email;
	// }

	// public LocalDateTime getCreatedAt() {
	// 	return this.createdAt;
	// }

	// public void setCreatedAt(LocalDateTime createdAt) {
	// 	this.createdAt = createdAt;
	// }

	// public LocalDateTime getUpdatedAt() {
	// 	return this.updatedAt;
	// }

	// public void setUpdatedAt(LocalDateTime updatedAt) {
	// 	this.updatedAt = updatedAt;
	// }
//}
