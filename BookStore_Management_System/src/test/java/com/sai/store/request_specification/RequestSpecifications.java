package com.sai.store.request_specification;

import org.junit.jupiter.api.BeforeEach;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecifications {

	private RequestSpecification requestSpecification;

	public RequestSpecification getRecSpec() {
		return requestSpecification;
	}
	@BeforeEach
	public void init()
	{
		requestSpecification = new RequestSpecBuilder().setContentType(ContentType.JSON)
													   .setAccept(ContentType.JSON)
													   .setBaseUri("http://localhost:8080")
													   .build();
	}
	
	
	
}
