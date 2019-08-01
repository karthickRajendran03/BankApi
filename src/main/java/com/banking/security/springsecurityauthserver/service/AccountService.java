package com.banking.security.springsecurityauthserver.service;

import com.banking.security.springsecurityauthserver.model.AccountDetails;

/**
 * @author Karthick Rajendran
 *
 */
public interface AccountService {

public AccountDetails loadAccountByUsername(String name);
}