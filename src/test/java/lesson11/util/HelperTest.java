package lesson11.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelperTest {
private static final String EMAIL_RIGHT = "kate@gmail.com";
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    Optional testedMethod() {
        return Optional.of(EMAIL_RIGHT);
    }
    @Test
    void checkIsPresent() {
        assertThat(testedMethod().isPresent());
    }

    private void assertThat(boolean present) {
        if(EMAIL_RIGHT == null || EMAIL_RIGHT.isEmpty()){
            assertFalse(null);
        }
    }

}