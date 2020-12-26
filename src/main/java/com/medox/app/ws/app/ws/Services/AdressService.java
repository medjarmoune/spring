package com.medox.app.ws.app.ws.Services;


import java.util.List;


import com.medox.app.ws.app.ws.shared.AdressDto;

public interface AdressService {

	List<AdressDto> getAllAdresses(String email);
	
	AdressDto createAdress(AdressDto adressDto, String email);
	
	AdressDto getAdress(String id);
	
	void deleteAdress(String id);
}
