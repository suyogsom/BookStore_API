package com.sai.store.books.textbooks.test;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.sai.store.request_specification.RequestSpecifications;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//@ExtendWith(SpringExtension.class) 
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class TextBooksControllerTest extends RequestSpecifications {
	
	RequestSpecifications textBooksTests;
	
	@Test
	@DisplayName("GET all text books")
	public void getAllTextBooks()
	{
		RestAssured.baseURI = "http://localhost:8080";
		Response res  = given(). //spec(textBooksTests.getRecSpec()).
						when().get("/books/textbooks").	
						then().assertThat().statusCode(200).and().extract().response();
	
		// convert raw data to string
		String response = res.asString();
		System.out.print(response);
	}
	
	@Test
	public void trial()
	{
		System.out.println("Hello");
	}

}