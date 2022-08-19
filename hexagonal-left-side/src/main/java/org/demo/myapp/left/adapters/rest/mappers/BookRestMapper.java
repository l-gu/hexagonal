package org.demo.myapp.left.adapters.rest.mappers;

import org.demo.myapp.core.domain.model.MutableBook;
import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.BookFactory;
import org.demo.myapp.core.domain.model.BookId;
import org.demo.myapp.left.adapters.rest.dto.BookDTO;

public class BookRestMapper {

	private BookFactory bookFactory ;
	
	public BookRestMapper(BookFactory bookFactory) {
		super();
		this.bookFactory = bookFactory;
	}

	public Book toBook(BookDTO bookDTO) {
		// Book book = bookFactory.createAlterableBook();
		BookId bookId = new BookId(bookDTO.getId());
		
		MutableBook book = bookFactory.createMutableBook(bookId);
//		book.setId(new BookId(bookDTO.getId()) );
		book.setTitle(bookDTO.getTitle());
		book.setPrice(bookDTO.getPrice());
		return book;
	}

	public BookDTO toBookDTO(Book book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId(book.getId().getId());
		bookDTO.setTitle(book.getTitle());
		bookDTO.setPrice(book.getPrice());
		return bookDTO;
	}
}
