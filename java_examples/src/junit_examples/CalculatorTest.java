package junit_examples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        double actualAddValue = calculator.add(3.25, 5.65);
        double expectedAddValue = 8.90;
        assertEquals(expectedAddValue, actualAddValue, .001);
    }

    @Test
    public void testSquareRoot_with_valid_argument() {
        double actualSquareRootValue = calculator.squareRoot(625.00);
        double expectedSquareRootValue = 25;
        assertEquals(expectedSquareRootValue, actualSquareRootValue, 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSquareRoot_with_invalid_arguments(){
        calculator.squareRoot(-9.0);
    }

    @Test
    public void testSquareRoot_with_invalid_arguments_given_correct_message(){
        try {
            calculator.squareRoot(-1.0);
            fail("Invalid exception");
        } catch (IllegalArgumentException e){
            assertEquals("Invalid number: -1.0", e.getMessage());
        }
    }

}