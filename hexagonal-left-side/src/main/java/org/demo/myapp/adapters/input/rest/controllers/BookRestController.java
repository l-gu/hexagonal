package org.demo.myapp.adapters.input.rest.controllers;

import java.util.Optional;

import org.demo.myapp.adapters.input.rest.dto.BookRestDTO;
import org.demo.myapp.adapters.input.rest.mappers.BookRestMapper;
import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.input.BookManagementService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookRestController {

	private BookManagementService bookService ; // injected
	
	/**
	 * Constructor usable for Dependency Injection
	 * @param bookService
	 */
	public BookRestController(BookManagementService bookService) {
		super();
		this.bookService = bookService;
	}

    @GetMapping("/{id}")
    Optional<BookRestDTO> httpRestGetBookById(@PathVariable long id) {
		BookRestDTO dto = findById(id);
		return Optional.of(dto);
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
