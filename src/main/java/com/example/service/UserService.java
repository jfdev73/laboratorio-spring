package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.model.Usuario;
import com.example.repository.UserReposytory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor


@Service
public class UserService  implements IUserService{
	
	@Autowired
	private final UserReposytory repository;

	
	
	public List<Usuario> getAll (){
		
		return repository.findAll();
		
	}



	@Override
	public Usuario findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
