package org.demo.myapp.core.application.services;

import org.demo.myapp.core.domain.model.Store;
import org.demo.myapp.core.ports.StoreManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StoreManagementServiceImpl implements StoreManagementService {

	// Standard logger (not static => can be reused without having to change the name of the class)
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

			
	//private final BookRepository bookRepository; // injected

	@Override
	public Store findStore(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStore(Store store) {
		logger.debug("updateStore {}", store);
		return true;
	}


}
