package com.cognizant.junit;

// this one for assert methods
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; //this imports the test annotation
public class calctest2 {
	
	Calc2 calc = new Calc2();
	@Test
	public void testAdd() {
	    int result = calc.add(5, 3);
	    assertEquals(8, result);
		
	
	}
	

}
