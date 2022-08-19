package org.demo.myapp.core.domain.model;

public class BookFactory {

	/**
	 * Restricted visibility (package)
	 * @return
	 */
	Book createBook(BookId id) {
		return new Book(id);
	}

	public MutableBook createMutableBook(BookId id) {
		return new MutableBook(id);
	}
}
