package com.stacktips;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("provideStringArgs")
    void testWithMethodSource(String week, String weekShort) {
        assertEquals(weekShort, week.substring(0, 3));
    }

    static Stream<Arguments> provideStringArgs() {
        return Stream.of(
                Arguments.of("SUNDAY", "SUN"),
                Arguments.of("MONDAY", "MON"),
                Arguments.of("TUESDAY", "TUE")
        );
    }
}