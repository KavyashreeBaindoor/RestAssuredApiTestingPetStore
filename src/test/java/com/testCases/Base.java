package com.testCases;

import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;
import com.payload.UserPayload;

public class Base {
	
	Faker f;
	UserPayload u;
	
	@BeforeClass
	public void generateData() {
		 f=new Faker();
		  u=new UserPayload();
		 u.setId(f.number().hashCode());
		 u.setUname(f.name().username());
		 u.setFname("kavya");	
		 u.setLname("shree");
		 u.setEmail("abc@gmail.com");
		 u.setPass("abc");
		 u.setPhone("9090909090");
		 u.setUserStatus(0);
		 
		}

}
