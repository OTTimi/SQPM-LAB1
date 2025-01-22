package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testOROperation() {
        Binary bin1 = new Binary("1010");
        Binary bin2 = new Binary("1100");
        Binary result = bin1.OR(bin2);
        assertEquals("1110", result.getNumber());
    }

    @Test
    public void testANDOperation() {
        Binary bin1 = new Binary("1010");
        Binary bin2 = new Binary("1100");
        Binary result = bin1.AND(bin2);
        assertEquals("1000", result.getNumber());
    }

    @Test
    public void testMultiplyOperation() {
        Binary bin1 = new Binary("101"); 
        Binary bin2 = new Binary("11");  
        Binary result = bin1.Multiply(bin2);
        assertEquals("1111", result.getNumber()); 
    }

    @Test
    public void testInvalidBinaryHandling() {
        Binary invalidBin = new Binary("ABC123");
        assertEquals("0", invalidBin.getNumber());
    }
}
