package org.demo.myapp.core.domain.model;

import org.demo.myapp.core.domain.commons.AggregateRoot;
import org.demo.myapp.core.domain.model.ido.StoreIDO;

/**
 * @author laguerin
 *
 */
public class Store extends AggregateRoot<Long> {
	
	private final String  code ;
	
	private String name ;

	/**
	 * Constructor using only the identifier
	 * @param code
	 */
	Store(String code) {
		super();
		this.code = code;
	}

	/**
	 * Constructor using an "Input Data Object"
	 * @param ido
	 */
	Store(StoreIDO ido) {
		super();
		this.code = ido.getCode();
		this.name = ido.getName();
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

}
