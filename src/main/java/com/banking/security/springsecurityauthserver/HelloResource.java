package com.banking.security.springsecurityauthserver;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.security.springsecurityauthserver.model.AccountDetails;
import com.banking.security.springsecurityauthserver.model.AccountValidation;
import com.banking.security.springsecurityauthserver.model.CreditCardDetails;
import com.banking.security.springsecurityauthserver.model.RoutingNumberValidation;
import com.banking.security.springsecurityauthserver.service.AccountService;
import com.banking.security.springsecurityauthserver.service.CustomUserDetailsService;

@RestController
@RequestMapping("/rest/bank")
public class HelloResource {
	
	 @Autowired
	 private AccountService accountService;
	 
	 public void setAccountService(AccountService accountService) {
	  this.accountService = accountService;
	 }
	 
	 @Autowired
	 private CustomUserDetailsService userService;


    public CustomUserDetailsService getUserService() {
		return userService;
	}
	public void setUserService(CustomUserDetailsService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
        
    @GetMapping(path = {"/getBalance"})
    public AccountDetails getBalance() {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     return accountService.loadAccountByUsername(auth.getName());
    }
    
    @GetMapping(path = {"/getCreditCardDetails"})
    public CreditCardDetails getCreditCardDetails() {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     return accountService.loadCreditCardDetails(auth.getName());
    }
    
    @GetMapping(path = {"/abaValidation/{routingNumber}"})
    public RoutingNumberValidation getAbaValidation(@PathVariable("routingNumber") String routingNumber) {     
     return accountService.getAbaValidation(routingNumber);
    }
    
    @GetMapping(path = {"/mbaasValidation/{accountNumber}"})
    public AccountValidation getMbaasValidation(@PathVariable("accountNumber") String accountNumber) {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     return accountService.getMbaasValidation(auth.getName(), accountNumber);
    }
    
    @GetMapping(path = {"/pbaValidation/{accountNumber}"})
    public AccountValidation getPbaValidation(@PathVariable("accountNumber") String accountNumber) {
     Authentication auth = SecurityContextHolder.getContext().getAuthentication();
     return accountService.getPbaValidation(auth.getName(), accountNumber);
    }

}
