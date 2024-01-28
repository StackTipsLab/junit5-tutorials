package com.stacktips;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ValueSourceTest {

    @ParameterizedTest
    @ValueSource(strings = {"SUNDAY", "MONDAY", "TUESDAY"})
    void testWithStrings(String argument) {

        assertNotNull(argument);
    }
}