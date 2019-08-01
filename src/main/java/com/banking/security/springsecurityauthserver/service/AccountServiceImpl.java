package com.banking.security.springsecurityauthserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.security.springsecurityauthserver.model.AccountDetails;
import com.banking.security.springsecurityauthserver.repository.AccountRepository;

/**
 * @author Karthick Rajendran
 *
 */
@Service
public class AccountServiceImpl implements AccountService{

 @Autowired
 private AccountRepository accountRepository;

 public void setAccountRepository(AccountRepository accountRepository) {
  this.accountRepository = accountRepository;
 }
 
@Override
public AccountDetails loadAccountByUsername(String name) {
	 Optional<AccountDetails> accountOptional = accountRepository.findByName(name);
	 System.out.println(accountOptional.toString());

     return accountOptional.get();
}

}
