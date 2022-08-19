package org.demo.myapp.adapters.output.db.mybatis;

import java.math.BigDecimal;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.BookFactory;
import org.demo.myapp.core.domain.model.MutableBook;
import org.demo.myapp.core.ports.output.db.BookRepository;

public class BookRepositoryImpl implements BookRepository {

	@Override
	public Book findBook(long id) {
		return fakeFindBook(id);
	}

	@Override
	public boolean updateBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	private Book fakeFindBook(long id) {
		if (id == 1) {
			MutableBook book = BookFactory.getInstance().createMutableBook(id);
			book.setTitle("Germinal");
			book.setPrice(BigDecimal.valueOf(12.34));
			return book ;
		}
		else if ( id == 2 ) {
			MutableBook book = BookFactory.getInstance().createMutableBook(id);
			book.setTitle("Dune");
			book.setPrice(BigDecimal.valueOf(56.78));
			return book ;
		}
		else {
			return null; 
		}
		
	}
}
