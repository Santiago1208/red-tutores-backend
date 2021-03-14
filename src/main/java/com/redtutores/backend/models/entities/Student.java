package com.redtutores.backend.models.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STUDENTS")
public class Student implements Serializable {

	private static final long serialVersionUID = 2462999499131191360L;
	
	@Id
	@Column(name = "STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "STUDENT_CODE")
	private String code;
	
	@Column(name = "STUDENT_NAME")
	private String name;
	
	@Column(name = "STUDENT_SURNAME")
	private String surname;
	
	@Column(name = "STUDENT_COLLEGE_NAME")
	private String collegeName;
	
	@Column(name = "STUDENT_PERIOD_COLLEGE_STARTED")
	private String periodCollegeStarted;
	
	@Column(name = "STUDENT_BIRTH")
	private LocalDate birth;
}
