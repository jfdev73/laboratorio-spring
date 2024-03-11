package com.example.service;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.example.model.Usuario;

@Component
public interface IUserService {
	
	public List<Usuario> getAll();
	
	public Usuario findById ();
	

}
