package com.redtutores.backend.rest.dto;

import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class StudentDTO implements Serializable {

	private static final long serialVersionUID = -6684190388090187703L;
	
	private Long id;
	
	private String code;
	
	private String name;
	
	private String surname;
	
	private String collegeName;
	
	private String periodCollegeStarted;
	
	private String birth;
	
	public LocalDate getBirthDateConverted() throws ParseException {
		String[] dateTokens = birth.split("-");
		int year = Integer.parseInt(dateTokens[0]);
		int month = Integer.parseInt(dateTokens[1]);
		int day = Integer.parseInt(dateTokens[2]);
		return LocalDate.of(year, month, day);
	}
	
	public void setBirthDate(LocalDate birth) {
		this.birth = birth.toString();
	}

}
