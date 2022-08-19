package org.demo.myapp.core.domain.services;

import org.demo.myapp.core.domain.model.Book;

/*
 * DOMAIN SERVICE 
 * 
 * A domain service is a stateless service object.
 * It encapsulates a use case that involves multiple aggregates.
 * Don't overuse domain services (the risk is to end up with an anemic model 
 * with many domain behavior in services).
 */
public class DummyService {

	public long doSomething(Book book) {
		// Just for example
		return book.getId();
	}

}
