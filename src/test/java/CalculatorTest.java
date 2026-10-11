import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2.0, 3.0);
        Assertions.assertEquals(5.0, result);
    }
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(5.0, 3.0);
        Assertions.assertEquals(2.0, result);
    }
    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(2.0, 3.0);
        Assertions.assertEquals(6.0, result);
    }
    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10.0, 2.0);
        Assertions.assertEquals(5.0, result);
    }
    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10.0, 0.0);
        });
    }

    // test modulus calculation
    @Test
    public void testModulus() {
        Calculator calculator = new Calculator();
        double result = calculator.modulus(10.0, 3.0);
        Assertions.assertEquals(1.0, result);
    }

    //test modulus calculation by zero
    @Test
    public void testModulusByZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.modulus(10.0, 0.0);
        });
    }

    //test exponential calculation
    @Test
    public void testExponential() {
        Calculator calculator = new Calculator();
        double result = calculator.exponential(2.0, 3.0);
        Assertions.assertEquals(8.0, result);

    }

    //test exponential calculation with exponent zero
    @Test
    public void testExponentialByZero() {
        Calculator calculator = new Calculator();
        double result = calculator.exponential(8.0, 0.0);
        Assertions.assertEquals(1.0, result);
    }

    // test squareroot with negative number
    @Test
    public void testSquareRoot() {
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(16.0);
        Assertions.assertEquals(4.0, result);
    }

    // test square root calculation with a negative number
    @Test
    public void testSquareRootByNegative() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.squareRoot(-16.0);
        });
    }

    // test percentage with vaild inputs
    public void testPercentage() {
        Calculator calculator = new Calculator();
        double result = calculator.percentage(13.0, 20.0);
        Assertions.assertEquals(65.0, result);
    }

    // test percentage when denominator is zero
    @Test
    public void testPercentageWithZero() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.percentage(10.0, 0.0);
        });
    }

    // test percentage when numerator is a negative number
    @Test
    public void testPercentageWithNegativeNumerator() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.percentage(-2.0, 2.0);
        });
    }

    // test percentage when denominator is lesser than numberator
    @Test
    public void testPercentageWithLesserDenominatior() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.percentage(25.0, 20.0);
        });
    }

}