package com.medox.app.ws.app.ws.controllers;

import java.lang.reflect.Type;
import java.security.Principal;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medox.app.ws.app.ws.Services.AdressService;
import com.medox.app.ws.app.ws.requestes.AdressRequest;
import com.medox.app.ws.app.ws.responses.AdressResponse;
import com.medox.app.ws.app.ws.responses.UserResponse;
import com.medox.app.ws.app.ws.shared.AdressDto;

@RestController
@RequestMapping("/adresses")
public class AdressController {
	
	@Autowired
	AdressService adressService;
	
	@GetMapping
	public ResponseEntity<List<AdressResponse>>getAdresses(Principal principal){

		List<AdressDto> adresses = adressService.getAllAdresses(principal.getName());
		
		Type listType = new TypeToken<List<AdressResponse>>(){}.getType();
		List<AdressResponse> adressesResponse = new ModelMapper().map(adresses, listType);
		
		return new ResponseEntity<List<AdressResponse>>(adressesResponse ,HttpStatus.OK);
	}
	@PostMapping(
			consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
		)
	public ResponseEntity<AdressResponse> StoreAdrresse(@RequestBody AdressRequest adressRequest, Principal principal) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		AdressDto adressDto = modelMapper.map(adressRequest, AdressDto.class);
		AdressDto createAdress = adressService.createAdress(adressDto, principal.getName());
		
		AdressResponse adressResponse = modelMapper.map(createAdress, AdressResponse.class);
		
		return new ResponseEntity<AdressResponse>(adressResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<AdressResponse> getOneAddresse(@PathVariable(name="id") String addressId) {
		
		AdressDto adressDto = adressService.getAdress(addressId);
		
		ModelMapper modelMapper = new ModelMapper();
		
		AdressResponse addressResponse = modelMapper.map(adressDto, AdressResponse.class);
		
		return new ResponseEntity<AdressResponse>(addressResponse, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updatreAddresse(@PathVariable(name="id") String addressId) {
		return new ResponseEntity<>("update addresses", HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Object> deleteAddresse(@PathVariable String id) {
		
		adressService.deleteAdress(id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
