package com.empirica.tourismagency.field;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserBilling {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userBillingName;
	private String userBillingStreet;
	private String userBillingCity;
	private String userBillingZipcode;

	@OneToOne(cascade=CascadeType.ALL)
	private UserPayment userPayment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserBillingName() {
		return userBillingName;
	}

	public void setUserBillingName(String userBillingName) {
		this.userBillingName = userBillingName;
	}

	public String getUserBillingStreet() {
		return userBillingStreet;
	}

	public void setUserBillingStreet(String userBillingStreet) {
		this.userBillingStreet = userBillingStreet;
	}



	public String getUserBillingCity() {
		return userBillingCity;
	}

	public void setUserBillingCity(String userBillingCity) {
		this.userBillingCity = userBillingCity;
	}


	public String getUserBillingZipcode() {
		return userBillingZipcode;
	}

	public void setUserBillingZipcode(String userBillingZipcode) {
		this.userBillingZipcode = userBillingZipcode;
	}

	public UserPayment getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(UserPayment userPayment) {
		this.userPayment = userPayment;
	}


}
