package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Usuario;
import com.example.service.IUserService;
import com.example.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UsuarioController {
	
	
	private final IUserService service;
	

	
	
	
	@GetMapping
	public List<Usuario>  getAll () {
		
		return service.getAll();
		
		
		
	}

}
