package com.banking.security.springsecurityauthserver.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.security.springsecurityauthserver.model.AccountDetails;

/**
 * @author Karthick Rajendran
 *
 */

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails,Integer>{
	 Optional<AccountDetails> findByName(String name);

}
