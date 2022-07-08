package org.demo.myapp.left.adapters.rest.dto;

import java.math.BigDecimal;

/**
 * @author lguerin
 *
 */
public class BookDTO {
	
	private int id ;
	private String title ;
	private BigDecimal price;
	

	public BookDTO() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
