package com.cognizant.junit;

//exercise 3
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

       // Assert null
        String name = null;
        assertNull(name);

        // Assert Not Null
        assertNotNull(new Object());

    }

}
