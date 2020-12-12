package com.banking.security.springsecurityauthserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.security.springsecurityauthserver.model.AccountDetails;
import com.banking.security.springsecurityauthserver.model.AccountValidation;
import com.banking.security.springsecurityauthserver.model.CreditCardDetails;
import com.banking.security.springsecurityauthserver.model.RoutingNumberValidation;
import com.banking.security.springsecurityauthserver.repository.AccountRepository;
import com.banking.security.springsecurityauthserver.repository.AccountValidationRepository;
import com.banking.security.springsecurityauthserver.repository.CreditCardRepository;
import com.banking.security.springsecurityauthserver.repository.RoutingNumberValidationRepository;

/**
 * @author Karthick Rajendran
 *
 */
@Service
public class AccountServiceImpl implements AccountService{

 @Autowired
 private AccountRepository accountRepository;
 
 @Autowired
 private CreditCardRepository creditCardRepository;

 @Autowired
 private AccountValidationRepository accountValidationRepository;
 
 @Autowired
 private RoutingNumberValidationRepository routingNumberValidRepository;
  
 public void setAccountRepository(AccountRepository accountRepository) {
  this.accountRepository = accountRepository;
 }
 
@Override
public AccountDetails loadAccountByUsername(String name) {
	 Optional<AccountDetails> accountOptional = accountRepository.findByName(name);	 
	 if(null != accountOptional) {
		 System.out.println("Customer Name --->" + accountOptional.get().getName());
		 System.out.println("PIN --->" + accountOptional.get().getPin());		 
		}	 

     return accountOptional.get();
}

@Override
public CreditCardDetails loadCreditCardDetails(String name) {
	 CreditCardDetails creditCardDetails = creditCardRepository.findByName(name);	 
	 if(null != creditCardDetails) {
		 System.out.println("Credit Card Account ID --->" + creditCardDetails.getAcctId());
			System.out.println("Credit Card Balance --->" + creditCardDetails.getBalance());
		}

     return creditCardDetails;
}

@Override
public RoutingNumberValidation getAbaValidation(String routingNumber) {
	RoutingNumberValidation routingOptional = routingNumberValidRepository.findByRouting(routingNumber);
	if(null != routingOptional) {
		System.out.println("Routing Number --->" + routingOptional.getValid());
	}
	return routingOptional;
}

@Override
public AccountValidation getMbaasValidation(String name, String accountNumber) {
	AccountValidation accountOptional = accountValidationRepository.findByAcct(accountNumber);
	if(null != accountOptional) {
		System.out.println("MBAAS Account Validation --->" + accountOptional.getValid());
	}
	return accountOptional;
}

@Override
public AccountValidation getPbaValidation(String name, String accountNumber) {
	AccountValidation accountOptional = accountValidationRepository.findByAcct(accountNumber);
	if(null != accountOptional) {
		System.out.println("PBA Account Validation --->" + accountOptional.getValid());
	}
	return accountOptional;
}

}
