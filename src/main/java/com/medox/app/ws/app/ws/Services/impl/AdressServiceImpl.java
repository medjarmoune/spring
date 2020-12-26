package com.medox.app.ws.app.ws.Services.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medox.app.ws.app.ws.Services.AdressService;
import com.medox.app.ws.app.ws.entities.AdressEntity;
import com.medox.app.ws.app.ws.entities.UserEntity;
import com.medox.app.ws.app.ws.repositories.AdressRepository;
import com.medox.app.ws.app.ws.repositories.UserRepository;
import com.medox.app.ws.app.ws.shared.AdressDto;
import com.medox.app.ws.app.ws.shared.UserDto;
import com.medox.app.ws.app.ws.shared.utils.Utils;

@Service
public class AdressServiceImpl implements AdressService {

	@Autowired
	AdressRepository adressRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	Utils util;

	@Override
	public List<AdressDto> getAllAdresses(String email) {

		UserEntity currentUser = userRepository.findByEmail(email);

		List<AdressEntity> adressEntities = currentUser.getAdmin() == true
				? (List<AdressEntity>) adressRepository.findAll()
				: adressRepository.findByUser(currentUser);
		Type listType = new TypeToken<List<AdressDto>>() {
		}.getType();
		List<AdressDto> adressesDto = new ModelMapper().map(adressEntities, listType);
		return adressesDto;
	}

	@Override
	public AdressDto createAdress(AdressDto address, String email) {

		UserEntity currentUser = userRepository.findByEmail(email);

		ModelMapper modelMapper = new ModelMapper();
		UserDto userDto = modelMapper.map(currentUser, UserDto.class);

		address.setAdressId(util.generateStringId(30));
		address.setUserDto(userDto);

		AdressEntity addressEntity = modelMapper.map(address, AdressEntity.class);

		AdressEntity newAddress = adressRepository.save(addressEntity);

		AdressDto addressDto = modelMapper.map(newAddress, AdressDto.class);

		return addressDto;
	}

	@Override
	public AdressDto getAdress(String addressId) {
		
		AdressEntity addressEntity = adressRepository.findByAdressId(addressId);
		
		ModelMapper modelMapper = new ModelMapper();
		
		AdressDto addressDto = modelMapper.map(addressEntity, AdressDto.class);
		
		return addressDto;
	}

	@Override
	public void deleteAdress(String adressId) {
		
		AdressEntity address = adressRepository.findByAdressId(adressId);

		if (address == null) throw new RuntimeException("Address not found");

		adressRepository.delete(address);
		
		
	}

}
