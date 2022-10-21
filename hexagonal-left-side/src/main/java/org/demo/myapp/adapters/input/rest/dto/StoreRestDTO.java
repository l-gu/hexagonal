package org.demo.myapp.adapters.input.rest.dto;

import org.demo.myapp.core.domain.model.ido.StoreIDO;

/**
 * @author lguerin
 *
 */
public class StoreRestDTO implements StoreIDO {
	
	private String code ;
	private String name ;
	
	public StoreRestDTO() {
		super();
	}
	
	@Override
	public String getCode() {
		return code;
	}
	public void setCode(String v) {
		this.code = v;
	}
	
	@Override
	public String getName() {
		return name;
	}
	public void setName(String v) {
		this.name = v;
	}

	@Override
	public String toString() {
		return "StoreRestDTO [code=" + code + ", name=" + name + "]";
	}

}
