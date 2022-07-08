package org.demo.myapp.core.domain.model;

public class BookFactory {

	/**
	 * Restricted visibility (package)
	 * @return
	 */
	Book createBook(BookId id) {
		return new Book(id);
	}

	public AlterableBook createAlterableBook(BookId id) {
		return new AlterableBook(id);
	}
}
