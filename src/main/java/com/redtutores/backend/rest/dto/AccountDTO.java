package com.redtutores.backend.rest.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class AccountDTO implements Serializable {
	
	private static final long serialVersionUID = -8150707622589387894L;
	
	private Long id;
	
	private String phoneNumber;
	
	private String password;
	
	private StudentDTO student;

}
