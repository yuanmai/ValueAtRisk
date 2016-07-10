package com.nm.var;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfidenceLevel_UnitTest {
    @Test
    public void shouldReturnCorrectDoubleForEnumEntry() {
        ConfidenceLevel test = ConfidenceLevel.NINETYNINE;
        int value = test.getValue();
        assertEquals(value, 99);
    }

}
