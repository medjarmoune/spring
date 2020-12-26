package com.medox.app.ws.app.ws.requestes;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRequest {

	@NotNull(message = "ce champ ne doit etre null !!")
	@Size(min = 3, message = "Ce champ est doit avoir au moin 3 caractaires !")
	private String firsName;
	
	@NotNull(message = "ce champ ne doit etre null !")
	@Size(min = 3,message = "Ce champ est doit avoir au moin 3 caractaires !")
	private String lastName;
	
	@NotNull(message = "ce champ ne doit etre null !")
	@Email(message = "ce champ doit respecter le format email")
	private String email;
	
	@NotNull(message = "ce champ ne doit etre null !")
	@Size(min = 8, max = 12)
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "must containt number appercase lowercase digit")
	private String password;
	
	private List<AdressRequest> adress;
	
	private ContactRequest contact;
	private Boolean admin;
	
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
	public List<AdressRequest> getAdress() {
		return adress;
	}
	public void setAdress(List<AdressRequest> adress) {
		this.adress = adress;
	}
	public ContactRequest getContact() {
		return contact;
	}
	public void setContact(ContactRequest contact) {
		this.contact = contact;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
}
