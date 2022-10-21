package org.demo.myapp.adapters.input.rest.controllers;

import org.demo.myapp.adapters.input.rest.dto.BookRestDTO;
import org.demo.myapp.adapters.input.rest.mappers.BookRestMapper;
import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.ports.BookManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookRestController {

	private static final Logger logger = LoggerFactory.getLogger(BookRestController.class);
	
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
    ResponseEntity<BookRestDTO>  httpRestGetBookById(@PathVariable long id) {
    	logger.debug("httpRestGetBookById({})", id);
		Book book = bookService.findBook(id);
		if ( book != null ) {
			return ResponseEntity.ok(BookRestMapper.getInstance().domainToDto(book));
		}
		else {
			return ResponseEntity.notFound().build();
		}		
    }

//	protected BookRestDTO findById(long id) {
//		Book book = bookService.findBook(id);
//		if ( book != null ) {
//			return BookRestMapper.getInstance().domainToDto(book);
//		}
//		else {
//			return null;
//		}
//	}

	@PutMapping("/{id}")
	protected ResponseEntity<Void> updateBook(@PathVariable long id, @RequestBody BookRestDTO bookDTO) {
    	logger.debug("updateBook({},{})", id, bookDTO);
		Book book = BookRestMapper.getInstance().dtoToDomain(bookDTO);
		if ( bookService.updateBook(book) ) {
			return ResponseEntity.ok().build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
		// return http response
	}
}
