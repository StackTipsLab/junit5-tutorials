package com.stacktips;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumSourceTest {

    @ParameterizedTest
    @EnumSource(DayOfWeek.class)
    void testWithEnumSource(DayOfWeek dayOfWeek) {
        assertNotNull(dayOfWeek);
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class, names = {"MONDAY", "FRIDAY"})
    void testWithEnumSourceIncludeOnlySomeDays(DayOfWeek dayOfWeek) {
        assertTrue(EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.FRIDAY).contains(dayOfWeek));
    }
}