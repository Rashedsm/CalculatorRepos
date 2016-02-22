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
		fail();		
	}
	
	@Test
	public void addTest() {
		fail();	
	}
	
	@Test
	public void subtractTest() {
		fail();	
	}
	
	@Test
	public void multiplyTest() {
		fail();	
	}
	
	@Test
	public void divideTest() {
		fail();	
	}
	
	@Test
	public void getHistoryTest() {
		fail();	
	}
}