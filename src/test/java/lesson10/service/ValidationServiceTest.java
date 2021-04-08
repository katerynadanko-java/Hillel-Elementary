package lesson10.service;

import lesson10.exception.WrongValueException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationServiceTest {
    private ValidationService validationService = new ValidationService();

    public static final int VALUE_ABOVE_ZERO = 23;
    public static final int VALUE_BELOW_ZERO = -23;
    public static final int VALUE_ZERO = 0;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @SneakyThrows
    @Test
    void checkValueAboveZero() {
        boolean result = validationService.checkValue(VALUE_ABOVE_ZERO);
        assertTrue(result);
    }
    @SneakyThrows
    @Test
    void checkValueBelowZero() {
        boolean result = validationService.checkValue(VALUE_BELOW_ZERO);
        assertFalse(result);
    }
    @Test
    void checkValueEqualsZero() {
        assertThrows(WrongValueException.class, () -> validationService.checkValue(VALUE_ZERO));
    }
}