package com.example.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.model.Usuario;

@Primary
@Service
public class UserService2 implements IUserService{

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
