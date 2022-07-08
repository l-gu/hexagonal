package org.demo.myapp.core.ports.input;

import org.demo.myapp.core.domain.model.Book;

/**
 * Input PORT 
 *
 */
public interface BookService {

	public Book findBook(int id);

	public boolean updateBook(Book book);

}
