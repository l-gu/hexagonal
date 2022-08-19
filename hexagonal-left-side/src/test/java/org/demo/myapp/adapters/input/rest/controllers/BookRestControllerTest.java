package org.demo.myapp.adapters.input.rest.controllers;

import org.demo.myapp.core.application.services.BookManagementServiceImpl;
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
