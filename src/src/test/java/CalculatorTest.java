package src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import main.java.com.calculator.app.service.impl.NumberConversionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private NumberConversionServiceImpl conversionServiceTR;
    private NumberConversionServiceImpl conversionServiceEN;

    @BeforeEach
    public void setUp() {
        conversionServiceTR = new NumberConversionServiceImpl("tr");
        conversionServiceEN = new NumberConversionServiceImpl("eg");
    }

    @Test
    public void testStringToInt() {
        int result = conversionServiceTR.convertStringToNumber("yedi");
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testIntToString() {
        String result = conversionServiceTR.convertNumberToString(2032);
        Assertions.assertEquals("iki bin otuz iki ", result);
    }

    @Test
    public void testStringToIntEN() {
        int result = conversionServiceEN.convertStringToNumber("two hundred twenty nine");
        Assertions.assertEquals(229, result);
    }

    @Test
    public void testIntToStringEN() {
        String result = conversionServiceEN.convertNumberToString(101);
        Assertions.assertEquals("one hundred one ", result);
    }

   
}
