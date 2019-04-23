package com.sai.store.books.textbooks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextBooksController {
	
	@Autowired
	private TextBooksService textBooksService;
	
	
	//get list of all text books
	@RequestMapping("/books/textbooks")
	public List<TextBooks> getAllTextbooks()
	{	return textBooksService.getAllTextbooks();  }
	
	
	// gets only particular text book
	@RequestMapping("/books/textbooks/{id}")  
	public TextBooks getTextbook(@PathVariable String id)  
	{	return textBooksService.getTextbook(id);	}
	
	
	// create text book
	@RequestMapping(method=RequestMethod.POST, value="/books/textbooks") 
	public void addTextbook(@RequestBody TextBooks textbook)  
	{	textBooksService.addTextbook(textbook);   }
		
	
	// update text book
	@RequestMapping(method=RequestMethod.PUT, value="/books/textbooks/{id}") 
	public void updateTextbook(@RequestBody TextBooks textbook, @PathVariable String id)  
	{	textBooksService.updateTextbook(textbook, id);   }
			
		
	// delete text book
	@RequestMapping(method=RequestMethod.DELETE, value="/books/textbooks/{id}") 
	public void deleteTextbook( @PathVariable String id)  
	{   textBooksService.deleteTextbook(id);	}
					
				
}
