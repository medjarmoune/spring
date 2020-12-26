package com.medox.app.ws.app.ws.shared;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6337112558280580424L;
	private long id;
	private String userId;
	private String firsName;
	private String lastName;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerificationtoken;
	private Boolean emailVerificationStatus = false;
	private List<AdressDto> adress;
	private ContactDto contact;
	private Boolean admin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVerificationtoken() {
		return emailVerificationtoken;
	}

	public void setEmailVerificationtoken(String emailVerificationtoken) {
		this.emailVerificationtoken = emailVerificationtoken;
	}

	public List<AdressDto> getAdress() {
		return adress;
	}

	public void setAdress(List<AdressDto> adress) {
		this.adress = adress;
	}

	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	public ContactDto getContact() {
		return contact;
	}

	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

}
