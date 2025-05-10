package com.ninad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void testAdd() {
        MathUtils mu = new MathUtils();
        assertEquals(5, mu.add(2, 3));
    }

    @Test
    void testDivideByZero() {
        MathUtils mu = new MathUtils();
        assertEquals(-1.0, mu.divide(5, 0));
    }

    // Add other tests for subtract and multiply too
}
