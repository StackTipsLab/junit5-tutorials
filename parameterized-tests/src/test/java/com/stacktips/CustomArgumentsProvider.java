package com.stacktips;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArgumentSourceTest {

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsProvider.class)
    void testWithCustomArgumentsSource(String input, int number) {
        assertNotNull(input);
        assertTrue(number > 0);
    }
}

class CustomArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("SUNDAY", 6),
                Arguments.of("MONDAY", 6),
                Arguments.of("TUE", 3),
                Arguments.of("HAPPY WEEKEND!", 14)
        );
    }
}