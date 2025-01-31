package Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator instance = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAdd(){
        int expected = 5;
        int actual = instance.add(2,3);
        assertEquals(expected,actual);
    }
    @Test
    void testAdd1(){
        int expected = 6;
        int actual = instance.add("1,2,3");
        assertEquals(expected,actual);
    }
    @Test
    void testadd2(){
        int expected = 6;
        int actual = instance.add(new int[]{1,2,3});
        assertEquals(expected,actual);
    }

    @Test
    void testSubtract(){
        int expected = 0;
        int actual = instance.subtract(4,4);
        assertEquals(expected,actual);
    }
    @Test
    void testMultiply(){
        int expected = 10;
        int actual = instance.multiply(5,2);
        assertEquals(expected,actual);
    }
    @Test
    void testDivide(){
        int expected = 5;
        int actual = instance.divide(10,2);
        assertEquals(expected,actual);
    }




}