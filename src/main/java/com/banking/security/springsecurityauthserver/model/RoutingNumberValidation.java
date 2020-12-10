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
@Table(name="VALID_ROUTING_NUMBER")
public class RoutingNumberValidation {
 
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long id;
 
 @Column(name="ROUTING_NUMBER")
 private String routing;
 
 @Column(name="VALID")
 private String valid;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getRouting() {
	return routing;
}

public void setRouting(String routing) {
	this.routing = routing;
}

public String getValid() {
	return valid;
}

public void setValid(String valid) {
	this.valid = valid;
}

}
