package org.demo.myapp.core.domain.model;

public class BookFactory {

	private static final BookFactory bookFactory = new BookFactory();
	
	public static BookFactory getInstance() {
		return bookFactory;
	}
	
	/**
	 * Private constructor (singleton : use getInstance)
	 */
	private BookFactory() {	
	}
	
	/**
	 * Restricted visibility (package)
	 * @return
	 */
	Book createBook(long id) {
		return new Book(id);
	}

	public MutableBook createMutableBook(long id) {
		return new MutableBook(id);
	}
}
