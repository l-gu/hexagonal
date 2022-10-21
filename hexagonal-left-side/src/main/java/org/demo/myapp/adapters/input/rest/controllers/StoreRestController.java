package org.demo.myapp.adapters.input.rest.controllers;

import java.util.Optional;

import org.demo.myapp.adapters.input.rest.dto.BookRestDTO;
import org.demo.myapp.adapters.input.rest.dto.StoreRestDTO;
import org.demo.myapp.adapters.input.rest.mappers.BookRestMapper;
import org.demo.myapp.adapters.input.rest.mappers.StoreRestMapper;
import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.Store;
import org.demo.myapp.core.ports.StoreManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/stores", produces = MediaType.APPLICATION_JSON_VALUE)
public class StoreRestController {

	private static final Logger logger = LoggerFactory.getLogger(StoreRestController.class);

	private StoreManagementService storeService ; // injected
	
	/**
	 * Constructor usable for Dependency Injection
	 * @param storeService
	 */
	public StoreRestController(StoreManagementService storeService) {
		super();
		this.storeService = storeService;
	}

    @GetMapping("/{code}")
    ResponseEntity<StoreRestDTO> httpGetOneStore(@PathVariable String code) {
    	logger.debug("httpGetOneStore({})", code);
		Store store = storeService.findStore(code);	
		if ( store != null ) {
			return ResponseEntity.ok(StoreRestMapper.getInstance().domainToDto(store));
		}
		else {
			return ResponseEntity.notFound().build();
		}		
    }

	@PutMapping("/{code}")
	protected ResponseEntity<Void> httpPutStore(@PathVariable String code, @RequestBody StoreRestDTO storeDto) {
    	logger.debug("httpPutStore({},{})", code, storeDto);		
		Store store = StoreRestMapper.getInstance().dtoToDomain(storeDto);
		if ( storeService.updateStore(store) ) {
			return ResponseEntity.ok().build();
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
