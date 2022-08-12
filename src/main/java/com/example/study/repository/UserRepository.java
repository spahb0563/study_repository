package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //기본적인 CRUD 쿼리문 생성해줌

    // selelct * from where account = ? << test03 , test04
//    Optional<User> findByAccount(String account); // JPA가 findBy까지 읽고 쿼리문으로 인식 그 다음 온 문자를 인자와 매칭

    // select * from where email = ?
//    Optional<User> findByEmail(String Email);

    // select * from where account = ? and email = ?
//    Optional<User> findByAccountAndEmail(String account, String email);

    //쿼리 메소드라 부름

    User findFirstByPhoneNumberOrderByIdDesc(String phoneNumber);


}
