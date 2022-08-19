package org.demo.myapp.left.adapters.rest.controllers;

import org.demo.myapp.core.application.services.BookManagementServiceImpl;
import org.demo.myapp.core.ports.input.BookManagementService;
import org.junit.Test;

public class BookRestControllerTest {

	@Test
	public void test() {
		//BookManagementService bookManagementService = new BookManagementServiceImpl() ;
		BookRestController c = new BookRestController(new BookManagementServiceImpl());
		c.findById(0);
		// TODO
	}

}
