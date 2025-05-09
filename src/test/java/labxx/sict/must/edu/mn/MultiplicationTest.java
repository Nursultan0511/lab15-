package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0));
    }

    @Test
    void testMultiplyByZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(0.0, 5.0));
        assertEquals(0.0, calc.multiply(7.0, 0.0));
    }
}
