package org.demo.myapp.core.domain.model;

/**
 * Book entity ID
 *
 */
public class BookId {
	
	private final int  id ;

	public BookId(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "BookId [" + id + "]";
	}
	
}
