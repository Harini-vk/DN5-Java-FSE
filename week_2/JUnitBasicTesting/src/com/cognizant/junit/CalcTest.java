package com.cognizant.junit;
//exercise 1
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
	
	@Test
	public void testADD() {
		//Arrange
		Calc c1 = new Calc();
		
		//ACT
		int res = c1.add(5,3);
		
		//ASsert
		assertEquals(8,res);
	}


}
