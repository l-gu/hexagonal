package org.demo.myapp.left.adapters.rest.mappers;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.demo.myapp.core.domain.model.Book;
import org.demo.myapp.core.domain.model.BookFactory;
import org.demo.myapp.core.domain.model.MutableBook;
import org.demo.myapp.left.adapters.rest.dto.BookRestDTO;
import org.junit.Test;

public class BookRestMapperTest {

	@Test
	public void testDtoToDomain() {
		BookRestDTO dto = new BookRestDTO();
		dto.setId(1);
		dto.setTitle("ABC");
		dto.setPrice(BigDecimal.valueOf(23.55));
		
		Book book = BookRestMapper.getInstance().dtoToDomain(dto);
		
		assertEquals(1, book.getId());
		assertEquals("ABC", book.getTitle());
		assertEquals(BigDecimal.valueOf(23.55), book.getPrice());
	}

	@Test
	public void testDomainToDto() {
		MutableBook book = BookFactory.getInstance().createMutableBook(12);
		book.setTitle("XYZ");
		book.setPrice(BigDecimal.valueOf(67.89));
		
		BookRestDTO dto = BookRestMapper.getInstance().domainToDto(book);
		
		assertEquals(12, dto.getId());
		assertEquals("XYZ", dto.getTitle());
		assertEquals(BigDecimal.valueOf(67.89), dto.getPrice());
	}

}
