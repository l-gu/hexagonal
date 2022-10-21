package org.demo.myapp.adapters.input.rest.mappers;

import org.demo.myapp.adapters.input.rest.dto.StoreRestDTO;
import org.demo.myapp.core.domain.model.Store;
import org.demo.myapp.core.domain.model.StoreFactory;

public class StoreRestMapper {
	
	private static final StoreRestMapper singleInstance = new StoreRestMapper();
	
	public static StoreRestMapper getInstance() {
		return singleInstance;
	}
	
	/**
	 * Private constructor (singleton : use getInstance)
	 */
	private StoreRestMapper() {	
	}
	
	public Store dtoToDomain(StoreRestDTO storeDTO) {
		return StoreFactory.getInstance().createStore(storeDTO);
	}

	public StoreRestDTO domainToDto(Store store) {
		StoreRestDTO dto = new StoreRestDTO();
		dto.setCode(store.getCode());
		dto.setName(store.getName());
		return dto;
	}
}
