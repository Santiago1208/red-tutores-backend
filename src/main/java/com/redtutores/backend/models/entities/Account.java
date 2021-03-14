package com.redtutores.backend.models.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable {
	
	private static final long serialVersionUID = -4323355194284856172L;
	
	@Id
	@Column(name = "ACCOUNT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ACCOUNT_PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "ACCOUNT_PASSWORD")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "STUDENTS_STUDENT_ID", referencedColumnName = "STUDENT_ID")
	private Student student;

}
