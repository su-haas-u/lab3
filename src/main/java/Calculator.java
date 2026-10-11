public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    // returns remainder of a modulus operation
    public double modulus(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 % num2;
    }

    //raises num1 to the power of num2
    public double exponential(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    // returns the square root of a number
    public double squareRoot (double num) {
        if (num <= 0) {
            throw new ArithmeticException("Please provide a positive integer.");
        }
        return Math.sqrt(num);
    }

    // returns percentage and handles three exceptions
    public double percentage(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (num1 < 0) {
            throw new IllegalArgumentException("Numerator has to be a positive integer.");
        }
        if (num2 < num1) {
            throw new IllegalArgumentException("Denominator has to be a positive integer greater than the numberator.");
        }
        return ((num1 / num2)*100);
    }

}