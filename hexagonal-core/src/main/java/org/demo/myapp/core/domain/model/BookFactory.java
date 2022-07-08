package org.demo.myapp.core.domain.model;

public class BookFactory {

	/**
	 * Restricted visibility (package)
	 * @return
	 */
	Book createBook() {
		return new Book();
	}

	public AlterableBook createAlterableBook() {
		return new AlterableBook();
	}
}
