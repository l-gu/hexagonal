package org.demo.myapp.core.domain.model;

import org.demo.myapp.core.domain.model.ido.StoreACL;
import org.demo.myapp.core.domain.model.ido.StoreIDO;

public class StoreFactory {

	private static final StoreFactory factory = new StoreFactory();
	
	public static StoreFactory getInstance() {
		return factory;
	}
	
	/**
	 * Private constructor (singleton : use getInstance)
	 */
	private StoreFactory() {	
	}
	
	/**
	 * Restricted visibility (package)
	 * @return
	 */
	Store createStore(String id) {
		return new Store(id);
	}

	/**
	 * Public visibility 
	 * Allow creation only from a predefined Input Data Object
	 * @param ido substitutable input data object 
	 * @return
	 */
	public Store createStore(StoreIDO ido) {
		// call "Anti-Corruption Layer" here 
		StoreACL.check(ido);
		// if OK continue 
		return new Store(ido);
	}
}
