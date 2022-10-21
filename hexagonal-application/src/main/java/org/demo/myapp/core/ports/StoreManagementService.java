package org.demo.myapp.core.ports;

import org.demo.myapp.core.domain.model.Store;

/**
 * Input PORT 
 *
 */
public interface StoreManagementService {

	public Store findStore(String id);

	public boolean updateStore(Store store);

}
