package com.medox.app.ws.app.ws.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -4967752355278325101L;

	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String userId;
	@Column(nullable = false, length = 50)
	private String firsName;
	@Column(nullable = false, length = 50)
	private String lastName;
	@Column(nullable = false, length = 120, unique = true)
	private String email;
	@Column(nullable = true)
	private Boolean admin = false;
	private String encryptedPassword;
	@Column(nullable = true)
	private String emailVerificationtoken;
	@Column(nullable = false)
	private Boolean emailVerificationStatus = false;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AdressEntity> adress;
	@OneToOne(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ContactEntity contact;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "users")
	private Set<GroupsEntity> groups = new HashSet<>();

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

	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	public List<AdressEntity> getAdress() {
		return adress;
	}

	public void setAdress(List<AdressEntity> adresses) {
		this.adress = adresses;
	}

	public ContactEntity getContact() {
		return contact;
	}

	public void setContact(ContactEntity contact) {
		this.contact = contact;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

}
