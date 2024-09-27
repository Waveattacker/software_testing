package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRomanIsNullThenReturnFalse() {
        assertFalse(Converter.validateRoman(null));
    }

    @Test
    void whenRomanIsEmptyThenReturnFalse() {
        assertFalse(Converter.validateRoman(""));
    }

    @Test
    void whenRomanContainsArabicNumbersThenReturnFalse() {
        assertFalse(Converter.validateRoman("XIV123"));
    }

    @Test
    void whenRomanContainsInvalidSymbolsThenReturnFalse() {
        assertFalse(Converter.validateRoman("XIV%M"));
    }

    @Test
    void whenRomanContainsCyrillicSymbolsThenReturnFalse() {
        assertFalse(Converter.validateRoman("ХІСМ"));
    }

    @Test
    void whenRomanIsLowerCaseThenReturnFalse() {
        assertFalse(Converter.validateRoman("xiv"));
    }

    @Test
    void whenRomanContainsNonRomanCharactersThenReturnFalse() {
        assertFalse(Converter.validateRoman("XIV;LM"));
    }

    @Test
    void whenRomanContainsInvalidCombinationsThenReturnFalse() {
        assertFalse(Converter.validateRoman("IIXII"));
    }

    @Test
    void whenRomanIsValidThenReturnTrue() {
        assertTrue(Converter.validateRoman("XIV"));
    }

    @Test
    void whenRomanIsValidLargeNumberThenReturnTrue() {
        assertTrue(Converter.validateRoman("MCMXCIV")); // 1994
    }
}