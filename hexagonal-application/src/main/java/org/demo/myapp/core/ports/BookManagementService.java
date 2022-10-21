package org.demo.myapp.core.ports;

import org.demo.myapp.core.domain.model.Book;

/**
 * Input PORT 
 *
 */
public interface BookManagementService {

	public Book findBook(long id);

	public boolean updateBook(Book book);

}
