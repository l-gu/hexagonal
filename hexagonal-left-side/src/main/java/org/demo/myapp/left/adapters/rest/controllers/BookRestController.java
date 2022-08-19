package org.demo.myapp.left.adapters.rest.controllers;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.input.BookManagementService;
import org.demo.myapp.left.adapters.rest.dto.BookRestDTO;
import org.demo.myapp.left.adapters.rest.mappers.BookRestMapper;

public class BookRestController {

	private BookManagementService bookService ;
	
	public BookRestController(BookManagementService bookService) {
		super();
		this.bookService = bookService;
	}

	
	public int httpRestGetBookById(long id) {
		BookRestDTO dto = findById(id);
		if ( dto != null ) {
			return 200; // OK
		}
		else {
			return 404; // NOT FOUND
		}
	}

	protected BookRestDTO findById(long id) {
		Book book = bookService.findBook(id);
		if ( book != null ) {
			return BookRestMapper.getInstance().domainToDto(book);
		}
		else {
			return null;
		}
//		BookRestDTO bookDTO = BookRestMapper.getInstance().domainToDto(book);
//		return bookDTO;
//		// return http response
	}

	protected void updateBook(BookRestDTO bookDTO) {
		Book book = BookRestMapper.getInstance().dtoToDomain(bookDTO);
		bookService.updateBook(book);
		// return http response
	}
}
