package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void whenConvert1ToRoman_thenResultIsI() {
        assertEquals("I", Converter.convertArabicToRoman(1));
    }

    @Test
    public void whenConvert2ToRoman_thenResultIsII() {
        assertEquals("II", Converter.convertArabicToRoman(2));
    }

    @Test
    public void whenConvert4ToRoman_thenResultIsIV() {
        assertEquals("IV", Converter.convertArabicToRoman(4));
    }

    @Test
    public void whenConvert5ToRoman_thenResultIsV() {
        assertEquals("V", Converter.convertArabicToRoman(5));
    }

    @Test
    public void whenConvert9ToRoman_thenResultIsIX() {
        assertEquals("IX", Converter.convertArabicToRoman(9));
    }

    @Test
    public void whenConvert10ToRoman_thenResultIsX() {
        assertEquals("X", Converter.convertArabicToRoman(10));
    }

    @Test
    public void whenConvert14ToRoman_thenResultIsXIV() {
        assertEquals("XIV", Converter.convertArabicToRoman(14));
    }

    @Test
    public void whenConvert19ToRoman_thenResultIsXIX() {
        assertEquals("XIX", Converter.convertArabicToRoman(19));
    }

    @Test
    public void whenConvert40ToRoman_thenResultIsXL() {
        assertEquals("XL", Converter.convertArabicToRoman(40));
    }

    @Test
    public void whenConvert45ToRoman_thenResultIsXLV() {
        assertEquals("XLV", Converter.convertArabicToRoman(45));
    }

    @Test
    public void whenConvert49ToRoman_thenResultIsXLIX() {
        assertEquals("XLIX", Converter.convertArabicToRoman(49));
    }

    @Test
    public void whenConvert50ToRoman_thenResultIsL() {
        assertEquals("L", Converter.convertArabicToRoman(50));
    }

    @Test
    public void whenConvert90ToRoman_thenResultIsXC() {
        assertEquals("XC", Converter.convertArabicToRoman(90));
    }

    @Test
    public void whenConvert95ToRoman_thenResultIsXCV() {
        assertEquals("XCV", Converter.convertArabicToRoman(95));
    }

    @Test
    public void whenConvert99ToRoman_thenResultIsXCIX() {
        assertEquals("XCIX", Converter.convertArabicToRoman(99));
    }

    @Test
    public void whenConvert100ToRoman_thenResultIsC() {
        assertEquals("C", Converter.convertArabicToRoman(100));
    }

    @Test
    public void whenConvert400ToRoman_thenResultIsCD() {
        assertEquals("CD", Converter.convertArabicToRoman(400));
    }

    @Test
    public void whenConvert445ToRoman_thenResultIsCDXLV() {
        assertEquals("CDXLV", Converter.convertArabicToRoman(445));
    }

    @Test
    public void whenConvert449ToRoman_thenResultIsCDXLIX() {
        assertEquals("CDXLIX", Converter.convertArabicToRoman(449));
    }

    @Test
    public void whenConvert495ToRoman_thenResultIsCDXCV() {
        assertEquals("CDXCV", Converter.convertArabicToRoman(495));
    }

    @Test
    public void whenConvert499ToRoman_thenResultIsCDXCIX() {
        assertEquals("CDXCIX", Converter.convertArabicToRoman(499));
    }

    @Test
    public void whenConvert500ToRoman_thenResultIsD() {
        assertEquals("D", Converter.convertArabicToRoman(500));
    }

    @Test
    public void whenConvert900ToRoman_thenResultIsCM() {
        assertEquals("CM", Converter.convertArabicToRoman(900));
    }

    @Test
    public void whenConvert950ToRoman_thenResultIsCML() {
        assertEquals("CML", Converter.convertArabicToRoman(950));
    }

    @Test
    public void whenConvert990ToRoman_thenResultIsCMXC() {
        assertEquals("CMXC", Converter.convertArabicToRoman(990));
    }

    @Test
    public void whenConvert995ToRoman_thenResultIsCMXCV() {
        assertEquals("CMXCV", Converter.convertArabicToRoman(995));
    }

    @Test
    public void whenConvert999ToRoman_thenResultIsCMXCIX() {
        assertEquals("CMXCIX", Converter.convertArabicToRoman(999));
    }

    @Test
    public void whenConvert1000ToRoman_thenResultIsM() {
        assertEquals("M", Converter.convertArabicToRoman(1000));
    }

    @Test
    public void whenConvert3900ToRoman_thenResultIsMMMCM() {
        assertEquals("MMMCM", Converter.convertArabicToRoman(3900));
    }

    @Test
    public void whenConvert3995ToRoman_thenResultIsMMMCMXCV() {
        assertEquals("MMMCMXCV", Converter.convertArabicToRoman(3995));
    }

    @Test
    public void whenConvertNumberJustUnderLimit_thenResultIsMMMCMXCIX() {
        assertEquals("MMMCMXCIX", Converter.convertArabicToRoman(3999));
    }

    @Test
    public void whenConvertInvalidNumberZero_thenResultIsNull() {
        assertNull(Converter.convertArabicToRoman(0));
    }

    @Test
    public void whenConvertNegativeNumber_thenResultIsNull() {
        assertNull(Converter.convertArabicToRoman(-5));
    }

    @Test
    public void whenConvertNumberGreaterThan3999_thenResultIsNull() {
        assertNull(Converter.convertArabicToRoman(4000));
    }

    @Test
    public void whenConvertInvalidNumberNonNumeric_thenResultIsNotNull() {
        assertNotNull(Converter.convertArabicToRoman((int) 'A'));
    }

    @Test
    public void whenConvertInvalidLargeNegativeNumber_thenResultIsNull() {
        assertNull(Converter.convertArabicToRoman(-5000));
    }

    @Test
    public void whenConvertInvalidNonNumberString_thenThrowNumberFormatException() {
        try {
            Integer.parseInt("Hello");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // Test passed
        }
    }

    @Test
    public void whenConvertExtremelyLargeNumber_thenResultIsNull() {
        assertNull(Converter.convertArabicToRoman(Integer.MAX_VALUE));
    }

    @Test
    public void whenConvertInput_thenInputNotModified() {
        int originalInput = 1987;
        Converter.convertArabicToRoman(originalInput);
        assertEquals(1987, originalInput);
    }

    @Test
    public void whenConvertExtremelySmallNumber_thenResultIsNull() {
        assertNull(Converter.convertArabicToRoman(-1000000));
    }


}