package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ApsilimasTest {

	@Test
	void testCalculator() throws Exception {
		
		Integer rez = Apsilimas.calculator(2, '+', 2);
		assertEquals(4, rez);
	}
	@Test
	void testCalculatorString() throws Exception {
		
		Integer rez = Apsilimas.calculator("2+2");
		assertEquals(4, rez);
	}
	
	@Test
	void testCalculatorException() {
		assertThrows(ArithmeticException.class, () -> Apsilimas.calculator(2, '/', 0),
				"Expected doThing() throw, but it didn't");
	}
	
	@Test
	void testCountWords() {
		Integer rez = Apsilimas.countWords("As laukiu savaitgalio");
		assertEquals(3, rez);
	}

}
