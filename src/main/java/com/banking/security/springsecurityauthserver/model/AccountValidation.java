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
@Table(name="VALID_ACCOUNT_NUMBER")
public class AccountValidation {
 
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long id;
 
 @Column(name="ACCOUNT_NUMBER")
 private String acct;
 
 @Column(name="NAME")
 private String name;
 
 @Column(name="VALID")
 private String valid;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAcct() {
	return acct;
}

public void setAcct(String acct) {
	this.acct = acct;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getValid() {
	return valid;
}

public void setValid(String valid) {
	this.valid = valid;
}
 
}
