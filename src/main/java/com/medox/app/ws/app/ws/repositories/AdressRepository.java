package com.medox.app.ws.app.ws.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.medox.app.ws.app.ws.entities.AdressEntity;
import com.medox.app.ws.app.ws.entities.UserEntity;

@Repository
public interface AdressRepository extends PagingAndSortingRepository<AdressEntity, Long> {

	List<AdressEntity> findByUser(UserEntity currentUser);

	AdressEntity findByAdressId(String id);

//	AdressEntity findByAdressId(String id);
}
