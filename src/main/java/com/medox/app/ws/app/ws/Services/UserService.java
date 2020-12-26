package com.medox.app.ws.app.ws.Services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.medox.app.ws.app.ws.shared.UserDto;

public interface UserService extends UserDetailsService{

	UserDto createUser(UserDto userDto);
	
	UserDto getUser(String email);
	
	UserDto getUserByuserId(String userId);
	
	UserDto updateUser(String id, UserDto userDto);
	
	List<UserDto> getUsers(int page, int limit, String search, int status);
	
	void deleteUser(String userId);
}
