package org.demo.myapp.core.application.services;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.input.BookManagementService;
import org.demo.myapp.core.ports.output.db.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookManagementServiceImpl implements BookManagementService {

	private final BookRepository bookRepository;

	public BookManagementServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Book findBook(long id) {
		return bookRepository.findBook(id);
	}

	public boolean updateBook(Book book) {
		return true;
	}

}
