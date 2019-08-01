package com.banking.security.springsecurityauthserver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Karthick Rajendran
 *
 */
@Entity
@Table(name="ACCOUNT_DETAILS")
public class AccountDetails {
 
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long id;
 
 @Column(name="ACCOUNT_ID")
 private String acctId;
 
 @Column(name="ACCOUNT_TYPE")
 private String acctType;
 
 @Column(name="ACCOUNT_BALANCE")
 private String balance;
 
 @Column(name = "name")
 private String name;
 
 @Column(name = "pin") 
 private String pin;
 
 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

public String getAcctId() {
	return acctId;
}

public void setAcctId(String acctId) {
	this.acctId = acctId;
}

public String getAcctType() {
	return acctType;
}

public void setAcctType(String acctType) {
	this.acctType = acctType;
}

public String getBalance() {
	return balance;
}

public void setBalance(String balance) {
	this.balance = balance;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPin() {
	return pin;
}

public void setPin(String pin) {
	this.pin = pin;
}
 

}
