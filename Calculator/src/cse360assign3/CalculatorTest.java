package cse360assign3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}

	@Test
	public void getTotalTest() {
		Calculator cal = new Calculator();
		assertEquals(0, cal.getTotal());
	}
	
	@Test
	public void addTest() {
		Calculator cal = new Calculator();
		cal.add(10);
		assertEquals(10, cal.getTotal());
	}
	
	@Test
	public void subtractTest() {
		Calculator cal = new Calculator();
		cal.subtract(10);
		assertEquals(-10, cal.getTotal());
	}
	
	@Test
	public void multiplyTest() {
		Calculator cal = new Calculator();
		cal.add(1);
		cal.multiply(5);
		assertEquals(5, cal.getTotal());
	}
	
	@Test
	public void divideTest() {
		Calculator cal = new Calculator();
		cal.add(10);
		cal.divide(2);
		assertEquals(5, cal.getTotal());
		cal.divide(0);
		assertEquals(0, cal.getTotal());
	}
	
	@Test
	public void getHistoryTest() {
		Calculator cal = new Calculator();		
		cal.add (4);		
		cal.subtract (2);		
		cal.multiply (2);	
		cal.add(5);
		
		assertEquals("0 + 4 - 2 * 2 + 5", cal.getHistory());
	}
}