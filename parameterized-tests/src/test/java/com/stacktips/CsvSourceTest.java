package com.stacktips;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({
            "SUNDAY, 6",
            "MONDAY, 6",
            "TUE, 3",
            "'', 0",
            "'HAPPY WEEKEND!', 14",
    })
    void testStringLength(String input, int expectedLength) {
        assertEquals(expectedLength, input.length());
    }

}