package com.cos.security1.repository;

import com.cos.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//jpaRepository를 상속해서 @Repository가 없어도 된다.
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);

}
