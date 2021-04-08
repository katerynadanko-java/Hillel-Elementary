package lesson10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calculator = new Calculator();

private final static int FIRST = 5;
private final static int SECOND = 7;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void plus() {
        int plus = calculator.plus(FIRST, SECOND);
        assertTrue(plus == FIRST+SECOND);
        assertEquals(12, calculator.plus(FIRST,SECOND));
    }
    @Test
    void minus() {
        int plus = calculator.plus(FIRST, SECOND);
        assertFalse(plus == FIRST-SECOND);
    }
}