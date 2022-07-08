package org.demo.myapp.core.domain.model;

import java.math.BigDecimal;

/**
 * @author laguerin
 *
 */
public class AlterableBook extends Book {
	
	/**
	 * Default constructor with reduced visibility (usable only in domain package)
	 */
	AlterableBook(BookId id) {
		super(id);
	}
	
//	/**
//	 * Public setter 
//	 * @param id
//	 */
//	public void setId(BookId id) {
//		super.setId(id);
//	}
	
	/**
	 * Public setter 
	 * @param title
	 */
	public void setTitle(String title) {
		super.setTitle(title);
	}
	
	/**
	 * Public setter 
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		super.setPrice(price);
	}

}
