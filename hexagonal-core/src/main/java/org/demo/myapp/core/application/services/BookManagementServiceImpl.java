package org.demo.myapp.core.application.services;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.input.BookManagementService;

public class BookManagementServiceImpl implements BookManagementService {

	public Book findBook(long id) {
		//Book book = bookRepository.find(id);
		Book book ;
		return null;
	}

	public boolean updateBook(Book book) {
		return true;
	}

}
