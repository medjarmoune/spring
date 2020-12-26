package com.medox.app.ws.app.ws.shared;

public class AdressDto {
	private long id;
	private String adressId;
	private String city;
	private String country;
	private String street;
	private String postal;
	private String type;
	private UserDto userDto;

	public long getId() {
		return id;
	}

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

	public UserDto getUserDto() {
		return userDto;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public String getAdressId() {
		return adressId;
	}

	public void setAdressId(String adressId) {
		this.adressId = adressId;
	}

}
