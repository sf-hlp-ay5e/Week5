package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BookNotAvailableExceptionTest {

	@Rule public ExpectedException thrown= ExpectedException.none();

	@Test
	public void testBookNotAvailableException() throws BookNotAvailableException {
		String expectedMessage = "Test message";
		thrown.expect(BookNotAvailableException.class);
		thrown.expectMessage(expectedMessage);
		throw new BookNotAvailableException(expectedMessage);
	}

}
