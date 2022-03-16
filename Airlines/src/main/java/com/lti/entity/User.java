package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User {
	@Id
	@GeneratedValue
	private int u_id;
	private String f_name;
	private String l_name;
	private int u_age;
	private String u_gender;
	private String u_email;
	private String u_address;
	private String u_pass;
	
	@OneToMany(mappedBy = "user")
	
	
	
	
	
	
	
	
	

}
