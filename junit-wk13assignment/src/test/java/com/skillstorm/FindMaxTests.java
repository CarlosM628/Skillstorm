package com.skillstorm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaxTests {
	
	@Test
    public void testNullArray() {
        int[] nullArray = null;
        assertEquals(0, ArrayHelpers.findMax(nullArray));
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        assertEquals(0, ArrayHelpers.findMax(emptyArray));
    }

    @Test
    public void testSingleValueArray() {
        int[] singleArray = {12};
        assertEquals(12, ArrayHelpers.findMax(singleArray));
    }

    @Test
    public void testMultipleValuesArray() {
        int[] array = {19, 65, 1, 9, 17};
        assertEquals(65, ArrayHelpers.findMax(array));
    }

    @Test
    public void testArrayWithNegativeValues() {
        int[] array = {19, -65, 1, 9, -17};
        assertEquals(19, ArrayHelpers.findMax(array));
    }

    @Test
    public void testArrayWithAllNegativeValues() {
        int[] array = {-19, -65, -1, -9, -17};
        assertEquals(-1, ArrayHelpers.findMax(array));
    }
}
