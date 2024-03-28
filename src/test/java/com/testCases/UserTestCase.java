package com.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.endPoints.UserModuleCrudOperations;

import io.restassured.response.Response;


public class UserTestCase  extends Base{

	@Test(priority=1)
	public void postReq() {
	Response r=UserModuleCrudOperations.createUser(u);
	r.then().log().all();
	Assert.assertEquals(r.getStatusCode(), 200);
	
	
	}
	
	@Test(priority=2)
	public void getReq() {
		
	
	Response r=UserModuleCrudOperations.getUser(this.u.getUname());
	r.then().log().all();
	Assert.assertEquals(r.getStatusCode(), 200);	
	}
	
	
	@Test(priority=3)
	public void updateReq() {
		u.setPhone("1111111111");
		
	Response r=UserModuleCrudOperations.updateUser(u,this.u.getUname());
	r.then().log().all();
	Assert.assertEquals(r.getStatusCode(), 200);
	
	
	}
	
	
	@Test(priority=4)
	public void deleteReq() {
		
	Response r=UserModuleCrudOperations.deleteUser(this.u.getUname());
	r.then().log().all();
	Assert.assertEquals(r.getStatusCode(), 200);	
	}
	
	
	
	
	
	
	

}
