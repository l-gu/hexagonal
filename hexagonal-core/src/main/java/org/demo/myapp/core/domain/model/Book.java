package org.demo.myapp.core.domain.model;

import java.math.BigDecimal;

import org.demo.myapp.core.domain.commons.AggregateRoot;

/**
 * @author laguerin
 *
 */
public class Book extends AggregateRoot<BookId> {
	
	private final BookId  id ;
	
	private String title ;
	private BigDecimal price;
	

	/**
	 * Constructor with reduced visibility (usable only in domain package)
	 */
	Book(BookId id) {
		super();
		this.id = id ;
	}
	
	/**
	 * Standard getter (usable everywhere)
	 * @return
	 */
	public BookId getId() {
		return id;
	}
	
//	/**
//	 * Setter with reduced visibility (usable only in domain package)
//	 * @param title
//	 */
//	void setId(BookId id) {
//		this.id = id;
//	}
	
	/**
	 * Standard getter (usable everywhere)
	 * @return
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Setter with reduced visibility (usable only in domain package)
	 * @param title
	 */
	void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Standard getter (usable everywhere)
	 * @return
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * Setter with reduced visibility (usable only in domain package)
	 * @param price
	 */
	void setPrice(BigDecimal price) {
		this.price = price;
	}

}
