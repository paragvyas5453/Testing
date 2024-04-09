package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLogReg {

	@Test
	void testReg() {
		assertTrue(loginValidate.regi("sp@gmail.com", "1234"));	
	}
	@Test
	void testLog() {
		assertTrue(loginValidate.Val("sp@gmail.com", "1234"));	
	}
	

}
