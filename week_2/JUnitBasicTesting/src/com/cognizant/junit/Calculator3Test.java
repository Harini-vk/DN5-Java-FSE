package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator3Test {

    Calculator3 calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator3();
        System.out.println("Setup Done");
    }

    @AfterEach
    void tearDown() {
        calc = null;
        System.out.println("Teardown Done");
    }

    @Test
    void testAdd() {

        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {

        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calc.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }

}