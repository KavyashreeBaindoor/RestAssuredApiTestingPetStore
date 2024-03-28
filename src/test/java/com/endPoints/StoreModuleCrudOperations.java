package com.endPoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.payload.StorePayload;
import com.payload.UserPayload;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class StoreModuleCrudOperations {
	
	public static Response placingOrder(StorePayload payload) {
		
		System.out.println(payload.getId());
		Response rep=given().log().all().contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(payload)
		.when().post(Urls.post_url_store);
		System.out.println(Urls.post_url_store);
	return rep;	
		
	}
	
	public static Response getOrder(int uname) {
	
		Response rep=given().log().all()
				.pathParam("orderid",uname)
		.when().get(Urls.get_url_store);
		
		
	return rep;	
		
	}
	
	
	public static Response updateUser(UserPayload payload,String uname) {
		Response rep=given().log().all()
				
				.header("Content-Type","application/json").accept(ContentType.JSON)
				.pathParam("username", uname)
		.body(payload)
		.when().put(Urls.put_url);
		
		System.out.println(Urls.put_url);
	return rep;	
		
	}
	
	public static Response deleteUser(String uname) {
		Response rep=given().log().all().pathParam("username", uname)
		.when().delete(Urls.delete_url);
	return rep;	
		
	}
	
	
	
	
	
	

}
