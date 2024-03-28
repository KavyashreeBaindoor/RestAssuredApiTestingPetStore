package com.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.endPoints.StoreModuleCrudOperations;
import com.endPoints.UserModuleCrudOperations;
import com.github.javafaker.Faker;
import com.payload.StorePayload;

import io.restassured.response.Response;


public class StoreTestCase {

	Faker f;
	StorePayload u;
	
	@BeforeClass
	public void generateData() {
		 f=new Faker();
		  u=new StorePayload();
		u.setId(f.number().hashCode());
		u.setPetId(f.number().hashCode());
		u.setQuantity(1);
		u.setShipDate("15/09/1998");
		u.setStatus("placed");
		u.setComplete(true);
		 
	}
	
	@Test(priority=1)
	public void postReq() {
	Response r=StoreModuleCrudOperations.placingOrder(u);
	r.then().log().all();
	Assert.assertEquals(r.getStatusCode(), 200);
	
	
	}
	
	@Test(priority=2)
	public void getReq() {
	Response r=StoreModuleCrudOperations.getOrder(u.getId());
	r.then().log().all();
	Assert.assertEquals(r.getStatusCode(), 200);
	
	
	}
	
	
	
	
	
	
	
}
