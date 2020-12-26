package com.medox.app.ws.app.ws.responses;

import java.util.List;

public class UserResponse {

	private String userId;
	private String firsName;
	private String lastName;
	private String email;
	private List<AdressResponse> adress;
	private ContactRespone contact;
	private Boolean admin;
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

	public List<AdressResponse> getAdress() {
		return adress;
	}

	public void setAdress(List<AdressResponse> adress) {
		this.adress = adress;
	}

	public ContactRespone getContact() {
		return contact;
	}

	public void setContact(ContactRespone contact) {
		this.contact = contact;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}


}
