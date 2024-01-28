package com.stacktips;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvFileSourceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data1.csv")
    void testWithCsvFileSource1(String day, int length) {
        assertEquals(length, day.length());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv", delimiter = ';')
    void testWithCsvFileSourceDelimiter(String day, int length) {
        assertEquals(length, day.length());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data3.csv", nullValues = {"NULL"})
    void testWithCsvFileSourceNullValue(String day, int length) {
        assertEquals(length, day != null ? day.length() : 0);
    }
}