package com.sai.store.books.textbooks;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextBooksService {

	@Autowired
	private TextBooksRepository topicRepository;

	
	// gives back all text books
	public List<TextBooks> getAllTextbooks()
	{	
		List<TextBooks> textBooks = new ArrayList<>(); 
		textBooks.add(new TextBooks("1001","CIS","Java intro","this is java book","23134",223.4));
		textBooks.add(new TextBooks("1002","CIVIL","Structure design","this book gives basic foundation of structural design","34567",432.4));
		topicRepository.findAll().forEach(textBooks::add);		
		return textBooks;		
	}
	
	
	// give back single text book
	public TextBooks getTextbook(String id)
	{ return topicRepository.findById(id).get();   }
		
	
	// adds a text book
	public void addTextbook(TextBooks textBook)
	{	topicRepository.save( textBook);	}
		
		
	// update a text book
	public void updateTextbook(TextBooks textBook, String id) 
	{	topicRepository.save(textBook);	}

		
	// delete a text book
	public void deleteTextbook(String id)
	{	topicRepository.deleteById(id);	    }
		
	
	
}
