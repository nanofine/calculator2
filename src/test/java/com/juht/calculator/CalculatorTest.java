package com.juht.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** 
  * Used for interace test
  * @author Hongtaek Ju
  */
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	/** 
	  * Used for interace test
	  * @author Hongtaek Ju
	  */
	public void testSum(){
		assertEquals(5, calculator.sum(2,3));
	}
	@Test
	/** 
	  * Used for interace test
	  * @author Hongtaek Ju
	  */
	public void testDif(){
		assertEquals(-1, calculator.dif(2,3));
	}
}
