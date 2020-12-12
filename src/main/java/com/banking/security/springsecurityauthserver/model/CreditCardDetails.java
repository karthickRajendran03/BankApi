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
@Table(name="CREDIT_CARD_DETAILS")
public class CreditCardDetails {
 
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long id;
 
 @Column(name="ACCOUNT_ID")
 private String acctId;
 
 @Column(name="OUTSTANDING_AMOUNT")
 private String balance;
 
 @Column(name = "NAME")
 private String name;
 
 @Column(name="DUE_DATE")
 private String dueDate;

 @Column(name="PAID_STATUS")
 private String paidStatus;
 
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

public String getDueDate() {
	return dueDate;
}

public void setDueDate(String dueDate) {
	this.dueDate = dueDate;
}

public String getPaidStatus() {
	return paidStatus;
}

public void setPaidStatus(String paidStatus) {
	this.paidStatus = paidStatus;
}
 
 

}
