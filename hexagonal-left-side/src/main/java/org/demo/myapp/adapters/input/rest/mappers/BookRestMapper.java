package org.demo.myapp.adapters.input.rest.mappers;

import org.demo.myapp.adapters.input.rest.dto.BookRestDTO;
import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.BookFactory;
import org.demo.myapp.core.domain.model.MutableBook;

public class BookRestMapper {
	
	private static final BookRestMapper singleInstance = new BookRestMapper();
	
	public static BookRestMapper getInstance() {
		return singleInstance;
	}
	
	/**
	 * Private constructor (singleton : use getInstance)
	 */
	private BookRestMapper() {	
	}
	

//	private final BookFactory bookFactory ;
//	
//	public BookRestMapper() {
//		super();
//		this.bookFactory = BookFactory.getInstance();
//	}

	public Book dtoToDomain(BookRestDTO bookDTO) {
		MutableBook book = BookFactory.getInstance().createMutableBook(bookDTO.getId());
		book.setTitle(bookDTO.getTitle());
		book.setPrice(bookDTO.getPrice());
		return book;
	}

	public BookRestDTO domainToDto(Book book) {
		BookRestDTO bookDTO = new BookRestDTO();
		bookDTO.setId(book.getId());
		bookDTO.setTitle(book.getTitle());
		bookDTO.setPrice(book.getPrice());
		return bookDTO;
	}
}
