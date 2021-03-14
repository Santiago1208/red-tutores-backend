package com.redtutores.backend.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redtutores.backend.rest.dto.AccountDTO;
import com.redtutores.backend.services.AccountService;

@RestController
@RequestMapping(path = {"/accounts"})
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createAccount(@RequestBody AccountDTO accountDTO) {
		ResponseEntity<String> response = null;
		try {
			accountService.save(accountDTO);
			response = new ResponseEntity<String>("Account created successfully", HttpStatus.CREATED);
		} catch (Exception e) {
			response = new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}

}
