package org.demo.myapp.core.ports.input;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.BookId;

/**
 * Input PORT 
 *
 */
public interface BookService {

	public Book findBook(BookId id);

	public boolean updateBook(Book book);

}
