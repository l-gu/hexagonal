package org.demo.myapp.core.application.services;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.BookId;
import org.demo.myapp.core.ports.input.BookService;

public class BookServiceImpl implements BookService {

	public Book findBook(BookId id) {
		//Book book = bookRepository.find(id);
		Book book ;
		return null;
	}

	public boolean updateBook(Book book) {
		return true;
	}

}
