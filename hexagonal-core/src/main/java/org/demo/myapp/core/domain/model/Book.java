package org.demo.myapp.core.domain.model;

import java.math.BigDecimal;

/**
 * @author laguerin
 *
 */
public class Book {
	
	private int  id ;
	private String title ;
	private BigDecimal price;
	

	/**
	 * Default constructor with reduced visibility (usable only in domain package)
	 */
	Book() {
		super();
	}
	
	/**
	 * Standard getter (usable everywhere)
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter with reduced visibility (usable only in domain package)
	 * @param title
	 */
	void setId(int id) {
		this.id = id;
	}
	
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
