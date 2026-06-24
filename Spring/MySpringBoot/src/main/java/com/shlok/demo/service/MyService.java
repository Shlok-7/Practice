// All business logic , make this service class as service will now talk to repository (DB)
// Previously we were doing this inside controller which makes it bulky when our project grows

package com.shlok.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shlok.demo.data.Books;
import com.shlok.demo.repository.IBookRepository;
import java.util.List;

@Service
public class MyService {
	
	@Autowired
	IBookRepository bookRepo;
	
	public List<Books>getAllbooks(){
		return bookRepo.findAll();
	}
	
	public void addBook(Books obj1) {
		bookRepo.save(obj1);
	}
	
	public void updateBooks(Books obj2) {
		bookRepo.save(obj2);
	}
	
	public void deleteBooks(int id) {
		bookRepo.deleteById(id);
	}

}
