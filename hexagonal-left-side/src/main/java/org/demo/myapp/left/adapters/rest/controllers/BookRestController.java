package org.demo.myapp.left.adapters.rest.controllers;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.input.BookService;
import org.demo.myapp.left.adapters.rest.dto.BookDTO;
import org.demo.myapp.left.adapters.rest.mappers.BookRestMapper;

public class BookRestController {

	private BookRestMapper bookRestMapper ;
	private BookService bookService ;
	
	public BookRestController(BookRestMapper bookRestMapper, BookService bookService) {
		super();
		this.bookRestMapper = bookRestMapper;
		this.bookService = bookService;
	}

	public void findById(int id) {
		Book book = bookService.findBook(id);
		BookDTO bookDTO = bookRestMapper.toBookDTO(book);
		// return http response
	}

	public void updateBook(BookDTO bookDTO) {
		Book book = bookRestMapper.toBook(bookDTO);
		bookService.updateBook(book);
		// return http response
	}
}
