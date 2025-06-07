package kr.ac.hansung.cse.springdatajpa.repository;

import kr.ac.hansung.cse.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
