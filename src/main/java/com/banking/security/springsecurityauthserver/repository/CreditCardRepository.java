package com.banking.security.springsecurityauthserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.security.springsecurityauthserver.model.CreditCardDetails;

/**
 * @author Karthick Rajendran
 *
 */

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCardDetails,Integer>{
	 CreditCardDetails findByName(String name);

}
