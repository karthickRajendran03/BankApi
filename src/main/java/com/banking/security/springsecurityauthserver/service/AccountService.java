package com.banking.security.springsecurityauthserver.service;

import com.banking.security.springsecurityauthserver.model.AccountDetails;
import com.banking.security.springsecurityauthserver.model.AccountValidation;
import com.banking.security.springsecurityauthserver.model.CreditCardDetails;
import com.banking.security.springsecurityauthserver.model.RoutingNumberValidation;

/**
 * @author Karthick Rajendran
 *
 */
public interface AccountService {

public AccountDetails loadAccountByUsername(String name);
public CreditCardDetails loadCreditCardDetails(String name);
public RoutingNumberValidation getAbaValidation(String routingNumber);
public AccountValidation getMbaasValidation(String name, String accountNumber);
public AccountValidation getPbaValidation(String name, String accountNumber);
}