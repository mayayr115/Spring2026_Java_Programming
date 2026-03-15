package Vehicles;
/**
 * A utility class that provides common mathematical operations.
 * This class includes methods for calculating factorials,
 * checking prime numbers, computing powers, and finding the
 * greatest common divisor (GCD) of two integers.
 *
 * All methods are static and can be called without creating an instance.
 *
 * Example usage:
 * MathTools.factorial(5);  // returns 120
 * MathTools.isPrime(7);    // returns true
 * MathTools.gcd(12, 18);   // returns 6
 * MathTools.power(2, 3);   // returns 8
 *
 * @author Jane Doe
 * @version 1.2
 * @since fall 2025
 */
public class MathTools {

    /**
     * Calculates the factorial of a given number.
     *
     * @param n the number to calculate the factorial for; must be non-negative
     * @return the factorial of {@code n}
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Checks if a given number is prime.
     *
     * @param n the number to check
     * @return {@code true} if {@code n} is prime; {@code false} otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Computes the greatest common divisor (GCD) of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of {@code a} and {@code b}
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    /**
     * Computes the value of {@code base} raised to the power of {@code exponent}.
     *
     * @param base the base number
     * @param exponent the exponent (can be negative, zero, or positive)
     * @return the result of {@code base^exponent}
     */
    public static double power(double base, int exponent) {
        double result = 1.0;
        int absExponent = Math.abs(exponent);
        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }
        return exponent >= 0 ? result : 1.0 / result;
    }

    /**
     * Returns the absolute value of a number.
     *
     * @param number the number
     * @return the absolute value of {@code number}
     */
    public static double absolute(double number) {
        return number < 0 ? -number : number;
    }
}
