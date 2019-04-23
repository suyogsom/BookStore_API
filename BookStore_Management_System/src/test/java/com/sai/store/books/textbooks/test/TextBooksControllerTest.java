package com.sai.store.books.textbooks.test;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.sai.store.request_specification.RequestSpecifications;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class TextBooksControllerTest extends RequestSpecifications {
	
	RequestSpecification textBooksTests; 
	static String textBookId;
	
	@BeforeEach
	public void initForTextBook()
	{
		textBooksTests = new RequestSpecifications().init();
	}
	
	// get all textbooks
	@Test
	@DisplayName("GET all text books")
	public void getAllTextBooks()
	{
		
		Response res  = given(). spec(textBooksTests).
						when().get("/books/textbooks").	
						then().assertThat().statusCode(200).and().extract().response();
	
		// convert raw data to string
		String response = res.asString();
		System.out.print(response);
		
	}
	
	// get a single textbook
	//@Test
	@DisplayName("POST a text book with ID")
	public void postATextBook()
	{
		String body = " {\r\n" + 
				"        \"id\": \"1004\",\r\n" + 
				"        \"department\": \"MIS\",\r\n" + 
				"        \"name\": \"Java EE\",\r\n" + 
				"        \"description\": \"this is java book\",\r\n" + 
				"        \"isbn\": \"23134\",\r\n" + 
				"        \"unitPrice\": 223.4\r\n" + 
				"    }";
		Response res  = given(). spec(textBooksTests).body(body).
						when().post("/books/textbooks/textBookId").	
						then().assertThat().statusCode(200).and().extract().response();
	
		// convert raw data to string
		String response = res.asString();
		System.out.print(response);
		
		JsonPath js = new JsonPath(response);
		textBookId =  js.get("[0].id");
		
		System.out.print("First Text book id :" + textBookId);
	}
	
	// update a textbook 
	//@Test
	@DisplayName("UPDATE a text book with ID")
	public void updateATextBook()
	{
		
		Response res  = given(). spec(textBooksTests).
						when().get("/books/textbooks").	
						then().assertThat().statusCode(200).and().extract().response();
	
		// convert raw data to string
		String response = res.asString();
		System.out.print(response);
	}
	
	
	// delete a textbook
	//@Test
	@DisplayName("DELETE a text book with ID")
	public void deleteATextBook()
	{
		
		Response res  = given(). spec(textBooksTests).
						when().get("/books/textbooks").	
						then().assertThat().statusCode(200).and().extract().response();
	
		// convert raw data to string
		String response = res.asString();
		System.out.print(response);
	}
	
	
}