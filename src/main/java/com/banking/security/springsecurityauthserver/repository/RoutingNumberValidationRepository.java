package com.banking.security.springsecurityauthserver.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.security.springsecurityauthserver.model.RoutingNumberValidation;

/**
 * @author Karthick Rajendran
 *
 */

@Repository
public interface RoutingNumberValidationRepository extends JpaRepository<RoutingNumberValidation,Integer>{
	 RoutingNumberValidation findByRouting(String routing);

}
