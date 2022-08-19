package org.demo.myapp.adapters.input.rest.dto;

import java.math.BigDecimal;

/**
 * @author lguerin
 *
 */
public class BookRestDTO {
	
	private long id ;
	private String title ;
	private BigDecimal price;
	

	public BookRestDTO() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
