package com.pedrogamarra.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrogamarra.mongo.domain.User;
import com.pedrogamarra.mongo.repository.UserRepositoy;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoy repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
