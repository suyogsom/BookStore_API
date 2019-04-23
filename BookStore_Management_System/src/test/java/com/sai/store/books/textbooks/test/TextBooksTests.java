package com.sai.store.books.textbooks.test;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import io.restassured.*;
import io.restassured.response.Response;

@ExtendWith(SpringExtension.class) 
@SpringBootTest  
public class TextBooksTests  {
	
	TextBooksTests textBooksTests;
	
	@Test
	@DisplayName("GET all text books")
	public void getAllTextBooks()
	{
		RestAssured.baseURI = "http://localhost:8080";
		Response res  = given().
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
