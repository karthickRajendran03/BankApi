package com.banking.security.springsecurityauthserver.repository;

import com.banking.security.springsecurityauthserver.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
