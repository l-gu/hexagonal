package org.demo.myapp.core.ports.output.db;

import org.demo.myapp.core.domain.model.Book;

/**
 * Output PORT for persistence in database
 *
 */
public interface BookRepository {

	public Book findBook(long id);

	public boolean updateBook(Book book);

}
