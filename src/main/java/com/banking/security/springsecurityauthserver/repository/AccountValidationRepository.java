package com.banking.security.springsecurityauthserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.security.springsecurityauthserver.model.AccountValidation;

/**
 * @author Karthick Rajendran
 *
 */

@Repository
public interface AccountValidationRepository extends JpaRepository<AccountValidation,Integer>{
	 AccountValidation findByAcct(String acct);

}
