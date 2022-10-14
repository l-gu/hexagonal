package org.demo.myapp.core.application.services;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.input.BookManagementService;
import org.demo.myapp.core.ports.output.db.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookManagementServiceImpl implements BookManagementService {

	// Standard logger (not static => can be reused without having to change the name of the class)
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

			
	private final BookRepository bookRepository; // injected

	/**
	 * Constructor usable for Dependency Injection
	 * @param bookRepository
	 */
	public BookManagementServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Book findBook(long id) {
		logger.debug("findBook {}", id);
		return bookRepository.findBook(id);
	}

	public boolean updateBook(Book book) {
		logger.debug("updateBook {}", book);
		return true;
	}

}
