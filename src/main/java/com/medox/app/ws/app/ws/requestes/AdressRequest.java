package com.medox.app.ws.app.ws.requestes;

public class AdressRequest {

	private String city;
	private String country;
	private String street;
	private String postal;
	private String type;
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getStreet() {
		return street;
	}
	public String getPostal() {
		return postal;
	}
	public String getType() {
		return type;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
